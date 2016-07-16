package com.liang.atl

import org.scalatest.FunSuite

/**
  * Created by lxx2 on 7/13/2016.
  */
class CBNCBV$Test extends FunSuite {

  test("testSquare_by_value") {
    assert(CBNCBV.square_by_value(2,3)==4)
    assert(CBNCBV.square_by_value(6,3)==36)
  }

  test("testSquare_by_name") {
    assert(CBNCBV.square_by_value(2,3)==4)
    assert(CBNCBV.square_by_value(6,3)==36)
  }

}
