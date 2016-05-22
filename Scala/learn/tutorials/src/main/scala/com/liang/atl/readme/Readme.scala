package com.liang.atl.readme

/**
  * Created by xueliang on 2/4/16.
  */
object Readme {
  def main(args: Array[String]) {
    println("\nIntroduction to Scala: \n\n" +
      "Scala, short for Scalable Language, is a hybrid functional programming language.\n" +
      "1) Objct-oriented ! \n" +
      "2) Scala is functional !\n" +
      "3) Don't have to specify a type in most cases, and you certainly \n" +
      "4) Runs on JVM, can execute java code !\n\n")

    println("Scala diffs from Java: \n" +
      "1) All types are objects.\n" +
      "2) Type inference.\n" +
      "3) Nested Functions.\n" +
      "4) Functions are objects.\n" +
      "5) Domain specific language (DSL) support.\n" +
      "6) Traits.\n" +
      "7) Closures.\n" +
      "8) Concurrency support inspired by Erlang.\n\n")


    println("Scala Web Frameworks: \n" +
      "1) The Lift Framework \n" +
      "2) The Play framework \n\n")


    println("Scala syntax: \n" +
      "1) Case Sensitivity: case-sensitive, Hello and hello is different in Scala. \n" +
      "2) Class Names: For all class names, the first letter should be in Upper Case.\n" +
      "3) Method Names: All method names should start with a Lower Case letter.\n" +
      "4) Name of the program file should exactly match the object name.\n" +
      "5) def main(args: Array[String]): Scala program processing starts from the main() " +
      "method which is a mandatory part of every Scala Program.")
  }
}
