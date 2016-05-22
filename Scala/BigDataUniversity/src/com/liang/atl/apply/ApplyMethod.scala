package com.liang.atl.apply

/**
  * Created by xueliang on 3/7/16.
  */

case class Time (hour: Int=0, minute:Int=0)

object Reverse {
  def apply(str:String): String = str.reverse
}

object ApplyMethod {
  def main(args: Array[String]): Unit = {
    Time.apply(22,22)
    Time.apply(10,10)

    val res = Reverse("Liang Xue")

    println(res)

  }
}
