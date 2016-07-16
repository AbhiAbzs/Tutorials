package com.liang.atl

/**
  * Created by lxx2 on 7/13/2016.
  */
object CBNCBV {

  /// SCALA normally use call-by-value, but if the type of a "function parameter" start with "=>" it use call-by-name

  /// Call-by-value evaluate every argument once
  /// Call-by-name does not evaluate the argument is not used

  def main: Unit = {

    // In call by value  "square(2+2) = square(4) = 4*4",  in total 2 steps
    square_by_value(2+2, 3)

    // In call by name   "square(2+2) = (2+2)*(2+2) = 4*4", in total 3 steps
    square_by_name(2+2, 3)
  }

  def square_by_value(r: Double, b: Double): Double = { r*r }

  def square_by_name(r: => Double, b: => Double ): Double = { r*r }
}
