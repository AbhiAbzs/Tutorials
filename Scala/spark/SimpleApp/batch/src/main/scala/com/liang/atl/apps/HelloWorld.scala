package com.liang.atl.apps

/**
  * Created by xueliang on 3/22/16.
  */

/* SimpleApp.scala */

import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {
    def main(args: Array[String]) {
      val logFile = args(0)
      val conf = new SparkConf().setAppName("Word Count")
      val sc = new SparkContext(conf)
      sc.setLogLevel("WARN")

      val logData = sc.textFile(logFile, 2).cache()

      val numAs = logData.filter(line => line.contains("a")).count()
      val numBs = logData.filter(line => line.contains("b")).count()

      println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
    }
}
