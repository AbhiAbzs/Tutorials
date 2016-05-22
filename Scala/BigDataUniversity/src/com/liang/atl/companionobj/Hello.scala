package com.liang.atl.companionobj

/**
  * Created by xueliang on 3/6/16
  *
  */


/// If a singleton object and a class share the same name
// and are located in the same source file, they called companion

/// A companion class can access "private field and method" inside
/// its companion object

class Hello {
  def print={
    println(Hello.message)
  }
}

object Hello {
  private val message:String = "Hello Scala!"

  def main(args: Array[String]) {
    def hel = new Hello()
    hel.print
  }
}

