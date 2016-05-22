package com.liang.atl.extractor

/**
  * Created by xueliang on 3/5/16.
  */



object Extractor {

  def main(args: Array[String]) {
    println("An extractor in Scala is an object that has a method called \"unapply\" \n" +
            "as one of its members. The purpose of that unapply method is to match a\n" +
            " value and take it apart.")

    println ("Apply method : " + apply("Zara", "gmail.com"));
    println ("Unapply method : " + unapply("Zara@gmail.com"));
    println ("Unapply method : " + unapply("Zara Ali"));
  }

  // The injection method (optional)
  def apply(user: String, domain: String) = {
    user +"@"+ domain
  }

  // The extraction method (mandatory)
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2){
      Some(parts(0), parts(1))
    }else{
      None
    }
  }

}
