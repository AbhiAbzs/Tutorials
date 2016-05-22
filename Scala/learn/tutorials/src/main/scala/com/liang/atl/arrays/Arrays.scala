package com.liang.atl.arrays

/**
  * Created by xueliang on 2/12/16.
  */
object Arrays {

  val str:String = "Scala provides a data structure, the array, which stores a \n" +
                   "fixed-size sequential collection of elements of the same type. \n" +
                   "An array is used to store a collection of data, but it is often more " +
                   "useful to think of an array as a collection of variables of the same type.\n"

  var family:Array[String] = new Array[String](3)
  // var family = new Array[String](3)

  var first_name = Array("Liang", "Zhaoli", "Aiden")

  def main(args: Array[String]): Unit = {
    println(str)

    family(0) = "Liang Xue"
    family(1) = "Zhaoli Liu"
    family(2) = "Aiden Xue"

    for(x<-family){
      println("Family member are: " + x + "\n")
    }

    for( x <- first_name ){
      println("First name are: " + x + "\n")
    }

  }
}
