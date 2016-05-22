package com.liang.atl.caseclass

/**
  * Created by xueliang on 3/7/16.
  */
case class Time (hour: Int=0, minute:Int=0)

case object Month

object test{
  def main(args: Array[String]) {
    val time = Time(21, 22)
    println("Current time is "+ time.hour +":"+time.minute)

    val m = Month
  }
}