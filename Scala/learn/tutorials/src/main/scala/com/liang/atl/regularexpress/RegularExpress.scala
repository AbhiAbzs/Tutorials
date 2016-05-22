package com.liang.atl.regularexpress


import scala.util.matching.Regex

/**
  * Created by xueliang on 3/4/16.
  */
object RegularExpress {
  def main(args: Array[String]): Unit = {
    println("Scala supports regular expressions through Regex\n" +
            "class available in the scala.util.matching package. ")

    val pattern = {
      //create a String and call the r() method on it.
      // Scala implicitly converts the String to a RichString
      // and invokes that method to get an instance of Regex.
      "Scala".r
    }
    val pattern1 = new Regex("(S|s)cala")

    val str = "Scala is Scalable and cool, please use scala"

    println((pattern findFirstIn str).mkString(","))
    println((pattern findAllIn str).mkString(","))
    println((pattern findAllMatchIn str).mkString(","))

    println((pattern1 findFirstIn str).mkString(","))
    println((pattern1 findAllIn str).mkString(","))
    println((pattern1 findAllMatchIn str).mkString(","))

  }
}
