package com.liang.atl.apps

import org.apache.commons.cli.{HelpFormatter, Options, BasicParser}
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.streaming.dstream.DStream
import org.apache.spark.streaming.{Seconds, StreamingContext}

import scala.collection.mutable

/**
  * Created by xueliang on 3/22/16.
  *
  * 1) Data can be ingested from many source like: kafka, flume, Twitter, or TCP/IP
  * 2) Then be process using high level funcs like map, reduce, ...
  * 3) Finally pushed out for file syatem, database, dashboard
  * 4) Internally work like:
  *  input data stream                  batch of input                batch of processed data
  *  ================>[spark streaming]================>[spark engine]=================>
  */



object DataStreamingExample {

  val usageText ="spark-submit --master spark://localhost:7077 \n" +
    "             --conf spark.cores.max=32 \n" +
    "             --executor-cores 1 --executor-memory 2G \n" +
    "             --class com.liang.atl.apps.DataStreamingExample \n" +
    "             /home/lxue/simple-app-1.0-SNAPSHOT-jar-with-dependencies.jar \n" +
    "             [-help] \n" +
    "             [-host hostname -port port-number] \n" +
    "             [-fs file:///home/lxx2/dropzone]"

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Word Count")
    val ssc = new StreamingContext(conf,Seconds(1))
    ssc.sparkContext.setLogLevel("WARN")

    var parser = new BasicParser()
    val options = new Options()
    options.addOption("help", false, usageText)
    options.addOption("test", false, "Use existing RDD for streaming test only.")
    options.addOption("host", true, "hostname for spark streaming via TCP/IP")
    options.addOption("port", true, "port number for spark streaming via TCP/IP")
    options.addOption("fs", true, "drop zone for spark streaming with filesystem input (NFS/HDFS/S3)")

    try{
      val cmd = parser.parse(options,args)
      if(cmd.hasOption("help")){
        val formatter = new HelpFormatter()
        formatter.printHelp("usage: ",options)
        System.exit(0)
      }
      else if(cmd.hasOption("host") && cmd.hasOption("port")){
        val host = cmd.getOptionValue("host")
        val port = cmd.getOptionValue("port")
        println(s"Spark Streaming: ingest data from TCP/IP socket, host: %s; \t port: %s; ".format(host,port))
        val data = ssc.socketTextStream(host,port.toInt)
        countWords(data)
      }
      else if (cmd.hasOption("fs")) {
        val inputDir = cmd.getOptionValue("fs")
        println(s"Spark Streaming: ingest data from filesystem (NFS/HDFS/S3 etc), input drop zone is".format(inputDir))
        val data = ssc.textFileStream(inputDir)
        countWords(data)
      }
      else if(cmd.hasOption("test")){
        println(s"Spark Streaming: no input argument; ingest existing queue of RDDs for test")

        // create the queue through which RDD will be pushed to
        // a QueueInputDStream
        val rddQueue = new mutable.Queue[RDD[String]]()
        val data = ssc.queueStream(rddQueue)
        countWords(data)

        for(i <- 1 to 20) {
          rddQueue.synchronized{
            rddQueue += ssc.sparkContext.makeRDD(Seq("1 1", "2 d", "abc", "xyz", "abc", "2 abc"))
          }
          Thread.sleep(1000)
        }
      }
      else {
        println(s"Error: wrong command line arguments.")
      }
    } catch {
      case x: Exception => {
        throw new Exception("Unexcepted options: " + x.getMessage())
        System.exit(1)
      }
    }

    ssc.start()
    ssc.awaitTermination()
  }

  def countWords(data: DStream[String]): Unit = {
    data.foreachRDD(rdd => rdd.take(5).foreach(println))
    val words = data.flatMap(_.split(" "))
    words.foreachRDD(rdd => rdd.take(5).foreach(println))
    val pairs = words.map(word => (word,1))
    pairs.foreachRDD(rdd => rdd.take(5).foreach(println))
    val counts = pairs.reduceByKey(_ + _)
    counts.foreachRDD(rdd => rdd.take(5).foreach(println))

    counts.print()
  }
}