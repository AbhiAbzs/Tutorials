package com.liang.atl

/**
  * Created by lxx2 on 7/13/2016.
  */
object HighOrderFunc {

  def sumInts (a: Int, b: Int): Int = {
    if(a>b) 0 else a + sumInts(a + 1, b)
  }

  /// sum{f(n)}   n from a to b
  def sumCubes(a: Int, b: Int): Int = {
    if(a>b) 0 else {a*a*a} + sumCubes(a+1,b)
  }

  /// High order func
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if(a>b) 0 else f(a) + sum(f, a+1, b)
  }

  def sum2(f: Int => Int, a:Int, b:Int):Int = {
    def loop(a:Int, acc:Int):Int = {
      if(a>b) acc else loop(a+1, f(a) + acc)
    }
    loop(a, 0)
  }
}
