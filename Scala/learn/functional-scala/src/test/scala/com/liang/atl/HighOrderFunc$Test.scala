package com.liang.atl

import org.scalatest.FlatSpec

/**
  * Created by lxx2 on 7/14/2016.
  */
class HighOrderFunc$Test extends FlatSpec {

  behavior of "HighOrderFunc$Test"

  it should "sumCubes" in {
    assert(HighOrderFunc.sumCubes(2,6) == 440)
  }

  it should "sumInts" in {
    assert(HighOrderFunc.sumInts(2,6) == 20)
  }

  it should "sum" in {
    def f(x:Int):Int = x*x*x
    assert(HighOrderFunc.sum( f, 2,6) == 440)
    assert(HighOrderFunc.sum( {case x => x*x*x}, 2,6) == 440)
  }

  it should "sum2" in {
    def f(x:Int):Int = x*x*x
    assert(HighOrderFunc.sum2( f, 2,6) == 440)
    assert(HighOrderFunc.sum2( {case x => x*x*x}, 2,6) == 440)
  }

}
