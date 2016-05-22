package com.liang.atl.helloworld

/**
  * Created by xueliang on 5/21/16.
  */
class HelloWorld$Test extends org.scalatest.FlatSpec {

  "A HelloWorld class" should "print hello world" in {
    val str = new Array[String](1)
    HelloWorld.main(str)
  }

}
