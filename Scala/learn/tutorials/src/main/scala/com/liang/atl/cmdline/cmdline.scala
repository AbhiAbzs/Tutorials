package com.liang.atl.cmdline

/**
  * Created by xueliang on 5/18/16.
  */
object cmdline {

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
    val option = args(0)

    option match {
      case "-h" | "-help"  => displayHelp(usageText)
      case "-Json2Parquet" => JSon2CSV
      case _               => println("Unknow command line arguments.")
    }
  }

  def displayHelp(usage: String): Unit = {
    println(usage)
  }

  def JSon2CSV: Unit = {
    println("JSon to CSV conveter ...")
  }
}
