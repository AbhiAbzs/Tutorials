package com.liang.atl.collections

/**
  * Created by xueliang on 2/14/16.
  */


class Person(val _name:String, var _age:Int){
  var name: String = _name
  var age: Int     = _age
}

object Collections {

  val intro:String = "Collections are containers of things. Those containers can be sequenced, \n" +
                     "linear sets of items like List, Tuple, Option, Map, etc. The collections may \n" +
                     "have an arbitrary number of elements or be bounded to zero or one element (e.g., Option).\n\n" +
                     "Collections may be strict or lazy. Lazy collections have elements that may not \n" +
                     "consume memory until they are accessed, like Ranges. Additionally, collections may \n" +
                     "be mutable (the contents of the reference can change) or immutable (the thing that a \n" +
                     "reference refers to is never changed). Note that immutable collections may contain \n" +
                     "mutable items. \n"

  //// List:  immutable
  //// Set:   immutable (by default), mutable (have to import scala.collection.mutable.Set)
  //// Map:   immutable (by default), mutable (have to import scala.collection.mutable.Map)
  //// Tuple: immutable

  /// List
  val fruit: List[String] = List("apple","pear","kiwi")
  // Empty List.
  val empty: List[Nothing] = List()
  // Two dimensional list
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

  /// Set
  val fruit1: Set[String] = Set("apple","pear","kiwi")

  /// Map
  val m1:Map[String, Int] = Map("Apple"->6, "pear"->7, "kiwi"->11)
  var m2:Map[Int, Int] = Map()

  /// Tuple
  val t1=(6,"Hello", Console)
  val t2 = new Tuple5(3, "Test", 3, 3.14, t1)

  def main(args: Array[String]): Unit = {
    println(intro)

    /// List
    println("Scala List :")
    for(a<-fruit){
      println(a)
    }

    /// Set
    for(a<-fruit1){
      println(a)
    }

    /// Map
    println(m1.keys, m1.values)
    m1.foreach{i => println(i._1 + " is " + i._2 + "$ per lb")}

    m2 += (6 -> 66)
    m2 += (7 -> 77)
    m2 += (8 -> 88)
    m2 += (9 -> 99)
    println(m2.keys, m2.values )

    /// Tuple
    println("Scala tuple combines a fixed number of items together \n" +
            "so that they can be passed around as a whole")
    t1.productIterator.foreach{i => println("Values = " + i)}


    /// Option
    println("Scala Option[T] is a container for zero or one element of a given type. \n" +
            "An Option[T] can be either Some[T] or None object, which represents a missing \n" +
            "value. \n \n" +
            "For instance, the get method of Scala's Map produces Some(value) if a value \n" +
            "corresponding to a given key has been found, or None if the given key is not \n" +
            "defined in the Map. \n\n" +
            "The Option type is used frequently in Scala programs and you can compare this to \n" +
            "null value available in Java which indicate no value. \n\n")
    val p1 = new Person("John",22)
    val p2 = new Person("Xue",30)
    var test:Map[String,Person] = Map("1"->p1, "5"->p2)
    println(test.get("1").toString)
    println(test.get("2"))


  }
}
