package com.liang.atl.datatype

/**
  * Created by xueliang on 2/4/16.
  */
object DataType {

  def printInt(): String ={
    val a : Int = 0
    val b = 6
    val c : Long = 777L
    val str: String = "a="+a+ "; b="+b+ "; c=" + c
    println(str)
    return str
  }

  def printFloat(): String ={
    val a: Float = 0.0f
    val b = 6.6e12
    val c: Float = 3.14159F
    val str: String = "a="+a+ "; b="+b+ "; c=" + c
    println(str)
    return str
  }

  def main(args: Array[String]) {
    println("Scala has all the same data types as Java, with the same memory footprint and precision.\n\n")
    println("Byte:   \t8 bit signed value. Range from -128 to 127\n" +
            "Short:  \t16 bit signed value. Range -32768 to 32767\n" +
            "Int:    \t32 bit signed value. Range -2147483648 to 2147483647\n" +
            "Long:   \t64 bit signed value. -9223372036854775808 to 9223372036854775807\n" +
            "Float:  \t32 bit IEEE 754 single-precision float\n" +
            "Double: \t64 bit IEEE 754 double-precision float\n" +
            "Char:   \t16 bit unsigned Unicode character. Range from U+0000 to U+FFFF\n" +
            "String: \tA sequence of Chars\n" +
            "Boolean:\tEither the literal true or the literal false\n" +
            "Unit:   \tCorresponds to no value\n" +
            "Null:   \tnull or empty reference\n" +
            "Nothing:\tThe subtype of every other type; includes no values\n" +
            "Any:    \tThe supertype of any type; any object is of type Any\n" +
            "AnyRef: \tThe supertype of any reference type")

    printInt()
    printFloat()
  }
}
