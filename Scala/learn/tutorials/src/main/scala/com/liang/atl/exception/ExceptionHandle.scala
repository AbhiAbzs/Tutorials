package com.liang.atl.exception

import java.io.{FileNotFoundException, FileReader}

/**
  * Created by xueliang on 3/4/16.
  */
object ExceptionHandle {
  def main(args: Array[String]) {
    try{
      val f = new FileReader("input.txt")
    }catch {
      case ex: FileNotFoundException => {
        println("Can not find input file.")
        throw new FileNotFoundException()
      }
      case ex: Exception => {
        println("Unknow errors.")
        throw new Exception()
      }
    }finally {
        println("Exiting finally ...")
    }
  }
}
