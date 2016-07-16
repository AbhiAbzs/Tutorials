package com.liang.atl

/**
  * Created by lxx2 on 7/14/2016.
  */

/// In computer science, currying, invented by Moses Schönfinkel and Gottlob Frege,
// is the technique of transforming a function that takes multiple arguments into a function
// that takes a single argument (the other arguments having been specified by the curry).

/// In a nutshell, currying is the process of decomposing a function of multiple arguments into
// a chained sequence of functions of one argument.
// f(a,b,x) --->   g(x)= x->(b->(a->f(a,b,x)))
// g(x)

object Currying {

  /// High-Order-Func
  def sumH(f: Int => Int, a: Int, b: Int): Int = {
    if(a>b) 0 else f(a) + sumH(f, a+1, b)
  }

  // NO CURRYING examples
  // sum takes a "func" as input and return another func with type is "(Int, Int) => Int"
  // Then u give args (a,b) to the returned func, and return an Int value
  def sumF(f: Int => Int): (Int, Int) => Int = {
    // Local func
    def sumLF(a: Int, b:Int): Int =
    if(a>b) 0 else f(a) + sumLF(a+1,b) /// return an Int value

    sumLF /// return this func
  }

  val sum1: (Int, Int) => Int = _ + _

  // product use (f)(a,b) as input and return an Int
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if(a>b) 1 else f(a)*product(f)(a+1,b)

  def fact(n: Int) = product(x => x)(1,n)




  // CURRYING examples
  def sumC(f: Int => Int)(a: Int)(b: Int): Int = {
      if(a>b) 0 else f(a) + sumC(f)(a+1)(b)
  }

  val sum1Curried: Int => Int => Int = sum1.curried

  def productC(f: Int => Int)(a:Int)(b:Int): Int = {
    if(a>b) 1 else f(a)*productC(f)(a+1)(b)
  }

}
