package com.liang.atl.funset

import org.scalatest.FunSuite

/**
  * Created by lxx2 on 7/15/2016.
  */
class FunSets$Test extends FunSuite {

  val s1 = FunSets.singletonSet(1)
  val s2 = FunSets.singletonSet(2)
  val s3 = FunSets.singletonSet(3)

  test("testContains") {
    assert(FunSets.contains(s1,1)==true)
    assert(FunSets.contains(s2,2)==true)
    assert(FunSets.contains(s3,3)==true)
  }

  test("testUnion") {
    println(s" union(s1, s2): " + FunSets.union(s1,s2))
    assert(FunSets.union(s1,s2)(1) == true)
    assert(FunSets.union(s1,s2)(2) == true)
    assert(FunSets.union(s1,s2)(3) == false)

  }
}
