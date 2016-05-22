package com.liang.atl.closures

/**
  * Created by xueliang on 2/11/16.
  */
object Closures {

  /// A closure is a function, whose return value depends on the value of
  //  one or more variables declared outside this function. Consider the
  // following piece of code with anonymous function:

  var factor = 10

  val multiplier = (i:Int) => i*factor

  def main(args: Array[String]) {
    println("multiplier(9): " + multiplier(9) + "\n" +
            "multiplier(11): " + multiplier(11) )
  }

}
