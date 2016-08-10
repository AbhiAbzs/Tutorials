package com.liang.atl

/**
  * Created by lxx2 on 7/20/2016.
  */
object CollectionsExample {

  def main: Unit = {

    ///------------------------------------------------------
    /// List and its built-in functions
    // All list are constructed from:
    /// > the empty list "Nil" and the construction operation "::" (pronounced cons)
    /// x :: xs gives a new list with first element x followed by the element xs

    val fruit = List("apple","pear","kiwi")
    val empty = List()
    val dim = List( List(1, 0, 0), List(0, 1, 0), List(0, 0, 1) )

    val fruit_new  = "apple" :: ("pear" :: ("kiwi" :: Nil))
    val empty_new = Nil
    val nums = 1 :: (2 :: (3 :: Nil ))

    fruit.foreach(x => println(x))
    println("first element is : " + fruit.head + ", last is : " + fruit.last)
    println("all elements except last are : " + fruit.init + ", last is : " + fruit.last)
    fruit.reverse.foreach(x => println(x))

    def my_last[T](xs: List[T]): T = xs match {
      case List() => throw new Error("last of empty list !")
      case List(x) => x
      case y :: ys => {
        println("y: " + y)
        ys.foreach(x => println(x))
        my_last(ys)
      }
    }

    def my_init[T](xs: List[T]): List[T] = xs match {
      case List() => throw new Error("last of empty list !")
      case List(x) => List()
      case y :: ys => {
        println("y: " + y)
        ys.foreach(x => println(x))
        y :: my_init(ys)
      }
    }

    println("My first element is : " + fruit.head + ", last is : " + my_last(fruit))
    println("My all elements except last are : " + my_init(fruit)  + ", last is : " + my_last(fruit))


    /// concatenation two list
    def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
      case List() => ys
      case z :: zs => {
        println("z: " + z)
        for (elem <- zs) {println(elem)}
        z :: concat(zs, ys)
      }
    }

    val num1 = List(1,5,9)
    val num2 = List(3,7,15,21)
    concat(num1, num2)

    /// reverse a list, type B is changeable
    def myreverse[B](xs: List[B]): List[B] = xs match {
      case List() => xs
      case y :: ys => myreverse(ys) ::: List(y)
    }
    myreverse(num1)
    myreverse(num2)

    // remove the nth element
    def removeAt[T](n: Int, xs: List[T]): List[T] = xs.take(n) ++ xs.drop(n+1)



    ///------------------------------------------------------
    /// pair
    val pair1 = ("yes", 1)
    val (label, value) = pair1
    println("1st is" + pair1._1 + "2nd is: " + pair1._2)
    println("1st is" + label + "2nd is: " + value)


    ///------------------------------------------------------
    /// tuples, more than two elements
    val t1 = Tuple5("no", 12, List(1,2), 5, List("SS","tt"))

    def merge(xs: List[Int], ys: List[Int]): List[Int] =
      (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x::xs1, y::ys1) => {
          if(x < y) x :: merge(xs1,ys)
          else y :: merge(xs, ys1)
        }
      }
    merge(num1, num2)

    def merge1(xs: List[Int], ys: List[Int])(lt: (Int, Int) => Boolean): List[Int] = {
      (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if ( lt(x,y) ) x :: merge1(xs1,ys)(lt)
          else y :: merge1(xs, ys1)(lt)
      }
    }
    merge1(num1, num2)((x:Int, y:Int) => x>y)
  }


}
