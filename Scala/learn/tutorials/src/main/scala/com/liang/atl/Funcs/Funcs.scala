package com.liang.atl.Funcs

import java.util.Date

/**
  * Created by xueliang on 2/8/16.
  */

object Funcs {
  /// Normal function
  def sum(a:Int, b:Int) : Int = {
    return a+b
  }

  /// Function: call-by-name
  def time() ={
    println("Getting time in nano seconds !")
    System.nanoTime()
  }
  def delay(t: => Long) = {
    println("In function delay() !")
    println("Param: " + t + "\n")
  }

  /// Function: vary arguments
  def sumstr(args: Array[String]): String = {
    var str=""
    for(s<-args){
      str = str + " " + s
    }
    return str
  }

  /// Function: default parameter values
  def multiply (a:Int=6, b:Int=9): Int = {
    a*b /// return is optional
  }

  /// function inside another function - local function
  def factorial1(i:Int=6): Int = {
    /// define a local function
    def fact(i:Int, accm:Int):Int={
      if(i<=1) return accm
      else fact(i-1, i*accm)
    }
    /// call local-function
    fact(i,1)
  }

  /// Partialy applied function
  def log(date:Date, message:String) = {
    println( date + " ------ " + message)
  }

  /// Named arguments allow you to pass arguments to a function in a different order.
  def printInt(m:Int,n:Int)={
    println("Value of m : " + m);
    println("Value of n : " + n);
  }

  /// recursion function
  def factorial2(n:Int=6): Int ={
    if(n==1) 1
    else n * factorial2(n - 1)
  }

  /// Higher-order function
  /// are functions that take other functions as parameters,
  /// or whose result is a function.
  def apply(f: Int => String, v:Int) = f(v)
  def square[A](x:A) = "[ This is " + x.toString + "]"


  /// Anonymous functions in source code are called function
  /// literals and at run time, function literals are instantiated
  /// into objects called function values
  var inc = (x:Int) => x*x


  /// Currying transforms
  def strcat(s1: String)(s2: String) = s1 + s2




  def main(args: Array[String]) {
    def a:Int = 5
    val b = 6
    println("5 + 6 = " + sum(a,b) + "\n")

    delay(time())

    val str1 = new Array[String](2)
    str1(0) = "Liang"
    str1(1) = "Xue"
    val str2 = Array("Zhaoli", "Liu")
    val str3 = Array("Aiden", "G.", "Xue")
    println("Husband is : " + sumstr(str1))
    println("Wife is : " + sumstr(str2))
    println("Son is : " + sumstr(str3) + "\n")

    println("Multiply result is: " + multiply() + "\n")

    println("factorial(6) is : " + factorial1(6) + "\n")

    println("factorial(5) is : " + factorial2(5) + "\n")


    val date = new Date()
    val logwDateBound = log(date, _ : String)
    logwDateBound("Message 1 ; ")
    Thread.sleep(2)
    logwDateBound("Message 2 ; ")
    Thread.sleep(2)
    logwDateBound("Message 3 ; \n")

    printInt(n=7,m=5)

    println( apply( square, 10 )+"\n")

    val sq = inc(9) -1
    println("9*9 -1 : " + sq + "\n")

    println("Output string is : " + strcat("foo")("bar") + "\n")

  }
}
