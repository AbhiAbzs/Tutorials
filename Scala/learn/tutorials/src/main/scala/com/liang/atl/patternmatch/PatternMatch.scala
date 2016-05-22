package com.liang.atl.patternmatch

/**
  * Created by xueliang on 3/4/16.
  */
object PatternMatch{
  def main(args: Array[String]) {
    println(matchTest(8))

    println(matchTest1("two"))
    println(matchTest1("test"))
    println(matchTest1(1))


    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Liang", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }


  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def matchTest1(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }


  // case class, empty one.
  case class Person(name: String, age: Int)
}