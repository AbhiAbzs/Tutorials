package com.liang.atl.io

import java.io.PrintWriter
import java.io.File

import scala.io.Source

/**
  * Created by xueliang on 3/5/16.
  */
object IO {
  def main(args: Array[String]) {
    //// Standard input from key board
    stdin

    //// Write to a file call test.txt
    write_to_file("test.txt")

    //// Read from test.txt
    read_from_file("test.txt")
  }

  def stdin = {
    print("Please enter your input : " )
    val line = Console.readLine
    println("Thanks, you just typed: " + line)
  }

  def write_to_file(file:String) = {
    val writer = new PrintWriter(new File(file))
    writer.write("Hello Scala")
    writer.close()
  }

  def read_from_file(file:String) ={
      Source.fromFile(file).foreach{
      print
    }
  }

}
