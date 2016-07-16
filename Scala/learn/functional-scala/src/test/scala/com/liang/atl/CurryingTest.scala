package com.liang.atl

import org.scalatest.FunSuite

/**
  * Created by lxx2 on 7/14/2016.
  */
class CurryingTest extends FunSuite {

// Currying tests
  test("testProductC") {
    assert(Currying.productC(x=>x)(1)(6)== 720)
  }

  test("testSum1Curried") {
    assert(Currying.sum1Curried(2)(6)== 8)
  }

  test("testSumC") {
    assert(Currying.sumC({case x => x*x*x })(2)(6) == 440)
  }

  /// No Currying tests
  test("testProduct") {
    assert(Currying.product(x=>x)(1,6)== 720)
  }

  test("testSum1") {
    assert(Currying.sum1(2,6) == 8)
  }

  test("testSumF") {
    assert(Currying.sumF({case x => x*x*x })(2,6) == 440)
  }

  test("testSumH") {
    assert(Currying.sumH( {case x => x*x*x}, 2,6) == 440)
  }

}
