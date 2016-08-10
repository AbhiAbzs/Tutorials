package com.liang.atl

/**
  * Created by lxx2 on 7/20/2016.
  *
  * This example not really work yet.
  */

abstract class HighOrderListFunc[T]{

  def map[U](f: T => U): HighOrderListFunc[T] = this match {
    case Nil => this
    case y :: ys => ys.map(ys)
  }

  def filter(p: T => Boolean): HighOrderListFunc[T] = this match {
    case Nil => this
    case x :: xs => if(p(x)) x :: xs.filter(p) else xs.filter(p)
  }
}

object Test {

  def square1(xs: List[Int]): List[Int] = xs match{
    case Nil => Nil
    case y :: ys => y*y :: square1(ys)
  }

  def square2(xs: List[Int]): List[Int] = xs.map(x => x*x)

  val num1 = List(5,6,7,8)
  square1(num1).foreach(println)
  square2(num1).foreach(println)

}

