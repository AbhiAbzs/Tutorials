package com.liang.atl.traits

/**
  * Created by xueliang on 3/4/16.
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}

object Test{

  def main(args: Array[String]) {
    println("A trait encapsulates method and field definitions, \n" +
      "which can then be reused by mixing them into classes. \n\n" +
      "Unlike class inheritance, in which each class must inherit\n" +
      "from just one superclass, a class can mix in any number of traits.\n" +
      "Traits are used to define object types by specifying the \n" +
      "signature of the supported methods. Scala also allows traits\n" +
      "to be partially implemented but traits may not have constructor\n" +
      "parameters. A trait definition looks just like a class definition.\n\n")

    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
    println("\n\n")

    println("When to use trait: \n" +
            "1) If the behavior will not be reused, then make it a concrete class. \n" +
            "2) If it might be reused in multiple, unrelated classes, make it a trait. Only traits can be mixed into different parts of the class hierarchy. \n" +
            "4) If you want to inherit from it in Java code, use an abstract class. \n" +
            "5) If you plan to distribute it in compiled form, and you expect outside groups to write classes inheriting from it, you might lean towards using an abstract class.\n" +
            "6) If efficiency is very important, lean towards using a class.\n")
  }
}