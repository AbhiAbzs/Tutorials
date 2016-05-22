package com.liang.atl.apps

import org.apache.commons.cli.{BasicParser, HelpFormatter, Options}
import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xueliang on 3/22/16.
  *
  * 1) A DataFrame is a distributed collection of data, which is organized into named columns.
  * 2) Conceptually, it is equivalent to relational tables with good optimization techniques.
  * 3) A DataFrame can be constructed from an array of different sources such as:
  *    Hive tables
  *    Structured Data files
  *    external databases
  *    existing RDDs
  * 4) Supports different data formats (Avro, csv, elastic search, and Cassandra) and storage
  *    systems (HDFS, HIVE tables, mysql, etc).
  * 5) Can be easily integrated with all Big Data tools and frameworks via Spark-Core.
  */

object DataFrameExample {
  val usageText ="spark-submit --master spark://localhost:7077 \n" +
    "             --conf spark.cores.max=32 \n" +
    "             --executor-cores 1 --executor-memory 2G \n" +
    "             --class com.liang.atl.apps.DataFrameExample \n" +
    "             simple-app-1.0-SNAPSHOT-jar-with-dependencies.jar \n" +
    "             [-help] \n" +
    "             [-json -i example.json] \n" +
    "             [-parquet -i example.parquet] \n" +
    "             [-csv -i example.csv] \n " +
    "             [-hive -i example.txt] \n " +
    "             [-db -i example.txt]"

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("DataFrame Example")
    val sc = new SparkContext(conf)
    sc.setLogLevel("WARN")

    var parser = new BasicParser()
    val options = new Options()
    options.addOption("help", false, "print out help page.")
    options.addOption("example", false, usageText)
    options.addOption("json", false, "load json files from external filesystem (NFS/HDFS/S3 etc).")
    options.addOption("csv", false, "load CSV files from external filesystem (NFS/HDFS/S3 etc).")
    options.addOption("parquet", false, "load parquet files from external filesystem (NFS/HDFS/S3 etc).")
    options.addOption("hive", false, "load files from external filesystem and use HIVE tables.")
    options.addOption("db", false, "load files from external filesystem (NFS/HDFS/S3 etc) and use HBase/Cassandra.")
    options.addOption("i", true, "input file path")

    try{
      val cmd = parser.parse(options,args)
      if(cmd.hasOption("help")){
        val formatter = new HelpFormatter()
        formatter.printHelp("usage: ",options)
        System.exit(0)
      }
      else if(cmd.hasOption("json") && cmd.hasOption("i")){
        val sqlContext = new SQLContext(sc)
        val inputfile = cmd.getOptionValue("i")
        println(s"Loading json files: %s;".format(inputfile))

        // In the background, SparkSQL supports two different methods to convert existing RDDs into DataFrames
        // 1) Inferring the Schema using Reflection
        // 2) Programmatically Specifying the Schema
        val df = sqlContext.read.json(inputfile)

        // Displays the content of the DataFrame to stdout
        df.show()
        df.printSchema()

        println(s"Some sparkSQL operations using Basic SQL syntax")
        JSonSQLOperations(sqlContext, df, inputfile)
      }
      else if (cmd.hasOption("parquet") && cmd.hasOption("i")) {
        val inputfile = cmd.getOptionValue("i")
        println(s"Loading parquet files: %s;".format(inputfile))
        /// some action
      }
      else if(cmd.hasOption("hive") && cmd.hasOption("i")){
        val inputfile = cmd.getOptionValue("i")
        println(s"Loading files: %s; and use Hive tables".format(inputfile))
        /// some action
      }
      else if(cmd.hasOption("db") && cmd.hasOption("i")){
        val inputfile = cmd.getOptionValue("i")
        println(s"Loading files: %s; and use HBase".format(inputfile))
        /// some action
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
  }

  def JSonSQLOperations(sqlContext: SQLContext, df: DataFrame, inputfile: String): Unit ={
    if(inputfile.contains("employee.json")) {
      df.select("name").show()
      df.filter(df("age")>25).show()
      df.groupBy("age").count().show()

      /// Some sparkSQL operations
      df.registerTempTable("employee")
      val after80s = sqlContext.sql("SELECT name FROM employee WHERE aga < 30")
      after80s.show()
      after80s.map(name => "Name: " + name(0)).collect().foreach(println)
    }
    else if(inputfile.contains("example.json")){
      /// Some dataframe action
      df.select("widget").show()

      /// Some spaekSQL operations
      val widget = df.select("widget")
      widget.registerTempTable("complex")
      sqlContext.sql("SELECT * FROM complex").show()

      /// key should not be the same as HIve keywords

      sqlContext.sql("SELECT widget.debug, widget,text FROM complex").show()
    }
  }
}