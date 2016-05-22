package com.liang.atl.apps

import org.apache.spark.sql.{SaveMode, SQLContext}
import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by xueliang on 3/22/16.
  */

/* SimpleApp.scala */

object FileFormatConverter {

  val usageText ="spark-submit --master spark://localhost:7077 \n" +
    "             --conf spark.cores.max=32 \n" +
    "             --executor-cores 1 --executor-memory 2G \n" +
    "             --class com.liang.atl.apps.DataFrameExample \n" +
    "             simple-app-1.0-SNAPSHOT-jar-with-dependencies.jar \n" +
    "             [-help] \n" +
    "             [-Json2Parquet example.json example.parquet] \n" +
    "             [-Json2CSV -i example.json example.csv] \n" +
    "             [-Parquet2Json example.parquet example.json] \n " +
    "             [-Parquet2CSV example.parquet example.csv] \n " +
    "             [-CSV2Json example.csv example.json] \n" +
    "             [-CSV2Parquet example.csv example.parquet]"

    def main(args: Array[String]) {
      val conf = new SparkConf().setAppName("Format Converter")
      val sc = new SparkContext(conf)
      sc.setLogLevel("WARN")
      val sqlContext = new SQLContext(sc)

      val option = args(0)
      val inputF = args(1)
      val outputDir = args(1)

      option match {
        case "-h" | "-help"  => displayHelp
        case "-Json2Parquet" => JSon2Parquet(sqlContext, inputF, outputDir)
        case "-Json2CSV"     => JSon2CSV(sqlContext, inputF, outputDir)
        case "-Parquet2Json" => displayHelp
        case "-Parquet2CSV"  => displayHelp
        case "-CSV2Json"     => displayHelp
        case "-CSV2Parquet"  => displayHelp
        case _               => println("Unknow command line arguments.")
      }

    }

  def displayHelp: Unit = {
    println(usageText)
  }

  def JSon2Parquet(sqlContext: SQLContext, inputF: String, outputDir: String): Unit = {
    try{
      val df = sqlContext.read.json(inputF)
      df.printSchema()
      df.show()
      df.write.parquet(outputDir)
    } catch {
      case x: Exception => {
        throw new Exception(s"Error converting json files to parquet format: %s".format(x.getMessage))
      }
    }
  }

  def JSon2CSV(sqlContext: SQLContext, inputF: String, outputDir: String): Unit = {
    try{
      val df = sqlContext.read.json(inputF)
      df.printSchema()
      df.show()
      df.write.mode(SaveMode.ErrorIfExists).format("com.databricks.spark.csv").save(outputDir)
    } catch {
      case x: Exception => {
        throw new Exception(s"Error converting json files to csv format: %s".format(x.getMessage))
      }
    }
  }
}
