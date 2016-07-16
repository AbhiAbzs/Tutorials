package com.liang.atl

import org.scalatest.FunSuite

/**
  * Created by lxx2 on 7/13/2016.
  */
class Recursions$Test extends FunSuite {

  test("testFactorial") {
    assert(Recursions.factorial(3)==6)
    assert(Recursions.factorial(5)==120)
  }

  test("testGcd") {
    assert(Recursions.gcd(14,21) == 7)
    assert(Recursions.gcd(15,25) == 5)
  }

  test("testPascal") {

    assert(Recursions.pascal(0,0) == 1)

    assert(Recursions.pascal(0,1) == 1)
    assert(Recursions.pascal(1,1) == 1)

    assert(Recursions.pascal(0,2) == 1)
    assert(Recursions.pascal(1,2) == 2)
    assert(Recursions.pascal(2,2) == 1)

    assert(Recursions.pascal(0,3) == 1)
    assert(Recursions.pascal(1,3) == 3)
    assert(Recursions.pascal(2,3) == 3)
    assert(Recursions.pascal(3,3) == 1)

    assert(Recursions.pascal(0,4) == 1)
    assert(Recursions.pascal(1,4) == 4)
    assert(Recursions.pascal(2,4) == 6)
    assert(Recursions.pascal(3,4) == 4)
    assert(Recursions.pascal(4,4) == 1)

    assert(Recursions.pascal(0,5) == 1)
    assert(Recursions.pascal(1,5) == 5)
    assert(Recursions.pascal(2,5) == 10)
    assert(Recursions.pascal(3,5) == 10)
    assert(Recursions.pascal(4,5) == 5)
    assert(Recursions.pascal(5,5) == 1)

  }
}
