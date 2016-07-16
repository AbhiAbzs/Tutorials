package com.liang.atl

/**
  * Created by lxx2 on 7/15/2016.
  */
object Rationals {

  def main: Unit = {
    val obj1 = new Rational(1,5)
    println(s"denom is %s".format(obj1.denom))

    val obj2 = new Rational(1,10)
    println(s"1/5 + 1/10 is %s".format(obj2.add(obj1)))
  }
}

class Rational (a: Int, b: Int) {
   def numer = a;
   def denom = b;

  def ratio: Double = {
    this.numer/this.denom
  }

  def add(that: Rational): Int = {
    (numer*that.denom + that.numer*denom)/(denom*that.denom)
  }
}
