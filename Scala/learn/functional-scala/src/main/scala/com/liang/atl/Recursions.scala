package com.liang.atl

import java.util

import scala.annotation.tailrec

/**
  * Created by lxx2 on 7/13/2016.
  */
object Recursions {

  def main: Unit = {
    val a = 14
    val b = 21
    println(s"The greatest common divisor of %d and %d is %d".format(a, b, gcd(a,b)))
  }

  /// Greatest number of two number

  @tailrec
  def gcd(a: Int, b:Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }

  def factorial(n: Int): Int = {
    if(n==1) 1 else n*factorial(n-1)
  }

  def pascal(c: Int, r: Int): Int = {
    if(c==0 || r<=1 || c==r) 1 else pascal(c-1, r-1) + pascal(c, r-1)
  }

}
