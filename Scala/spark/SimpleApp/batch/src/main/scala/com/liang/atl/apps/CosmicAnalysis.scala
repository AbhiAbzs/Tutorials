package com.liang.atl.apps

/**
  * Created by xueliang on 3/22/16.
  */

/* CosmicAnalysis.scala */

import java.io.File

import org.apache.hadoop.fs.{FileSystem, Path}
import org.apache.spark
import org.apache.spark.{SparkConf, SparkContext}

object CosmicAnalysis extends spark.Logging {

  val USAGE = "Usage: " +
              "spark-submit --master spark://localhost:7077 \n" +
              "             --conf spark.cores.max=32 \n" +
              "             --executor-cores 1 --executor-memory 2G \n" +
              "             --class com.liang.atl.apps.CosmicAnalysis \n" +
              "             /home/lxue/simple-app-1.0-SNAPSHOT-jar-with-dependencies.jar \n" +
              "             /path/to/inputPatten     /path/to/outputDir \n"

  var outputisHDFS = true

    def main(args: Array[String]) {

      if(args.size != 2) throw new Exception(s"Wrong command line argument: ${args.size} ;\n " + USAGE )

      val inputPatten = args(0)
      val outputDir = args(1)

      println("Input directory is: %s, \t output directory is: %s".format(inputPatten, outputDir))

      if(outputDir contains "file://" ) outputisHDFS = false

      val conf = new SparkConf().setAppName("Cosmic Analysis")
      val sc = new SparkContext(conf)

      // prepare the output directory
      prepareOutputDir(sc,outputDir)

      // load data
      doCalculation(sc, inputPatten, outputDir)
    }

  def doCalculation(sc:SparkContext, inputPatten:String, outputDir:String): Unit = {
    val startTime = System.currentTimeMillis
    val inputData = sc.textFile(inputPatten)
    val elapsedTime = (System.currentTimeMillis - startTime)/1000.0 /// Must have .0 here, otherwise scala consider 1000 as an object
    println(f"elapsed time is : ${elapsedTime}%.3f " )

    val partitionCount = inputData.partitions.size
    println("partition count : " + partitionCount)

    /// Data QA
    val goodData = inputData.filter(line => !line.contains(" 9999"))

    /// Create key/value pairs
    val DateCRPair = goodData.map(line => (line.split(" ")(0).substring(3,11), line.split(" ")(4).toInt))
    println("print out DateCRPair collection : ")
    DateCRPair.take(10).foreach(println) /// for test

    /// mark each value (k, (v,w)), where w count as 1
    val markedDateCRPair = DateCRPair.mapValues(mark => (mark,1))
    markedDateCRPair.take(10).foreach(println) /// for test

    /// Reduce the map and calculate sum
    val reducedDateCRPair = markedDateCRPair.reduceByKey((x,y) => (x._1+y._1, x._2+y._2))

    //// Calculate daily average
    val dailyAvg = reducedDateCRPair.map{ x =>
      val temp = x._2
      val sum = temp._1
      val total = temp._2
      (x._1, sum/total)
    }
    dailyAvg.sortByKey().take(10).foreach(println)

    /// Output the date and average counts as text output
    dailyAvg.sortByKey().saveAsTextFile(outputDir)
  }

  def prepareOutputDir(sc:SparkContext, outputDir:String): Unit = {
    if(outputisHDFS) {
      println("Using HDFS for output directory.")

      try {
        val outputPath = new Path(outputDir)
        val hdfs = FileSystem.get(sc.hadoopConfiguration)

        if(hdfs.exists(outputPath)) hdfs.delete(outputPath, true)
       // hdfs.mkdirs(outputPath)
      } catch {
        case x: Exception => {
        throw new Exception ("Exception in prepareOutputDir(): failed to create hdfs output directory !" + x.getMessage)
        }
      }
    }
    else {
      println("Using local FS for output directory.")

      try{
        val dir: File = new File(outputDir.split(":")(1))
        if(dir.exists()){
          val files = dir.listFiles()
          for(file <- files){
            println("Deleting file: " + file)
            file.delete()
          }
          dir.delete()
        }
      } catch {
        case x: Exception => {
          throw new Exception ("Exception in prepareOutputDir(): failed to create local output directory ! " + x.getMessage)
        }
      }
    }
  }

}
