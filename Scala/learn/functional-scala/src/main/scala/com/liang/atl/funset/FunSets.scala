package com.liang.atl.funset

/**
  * Created by lxx2 on 7/15/2016.
  */
object FunSets {
  /**
    * We represent a set by its characteristic function, i.e.
    * its `contains` predicate.
    */
  type Set = Int => Boolean

  /**
    * Indicates whether a set contains a given element.
    *
    * Here : s is a function, where type "Set" is "Int => Boolean"
    */
  def contains(s: Set, elem: Int): Boolean = s(elem)
  // def contains(s: Int => Boolean, elem: Int): Boolean = s(elem)

  /**
    * Returns the set of the one given element.
    *
    * Here singletonSet ia a func that return another func(x)
    */
  def singletonSet(elem: Int): Set = { x => elem == x }
  //def singletonSet(elem: Int): Int => Boolean = { x => elem == x }


  /**
    * Returns the union of the two given sets,
    * the sets of all elements that are in either `s` or `t`.
    *
    * Here both s and t are functions, and union return another function(x)
    */
  def union(s: Set, t: Set): Set = { x => contains(s,x) || contains(t,x) }
  /// def union(s: Set, t: Set): Int => Boolean = { x => contains(s,x) || contains(t,x) }

  /**
    * Returns the intersection of the two given sets,
    * the set of all elements that are both in `s` and `t`.
    *
    * Here both s and t are functions, and intersect return another function(x)
    */
  def intersect(s: Set, t: Set): Set =  { x => contains(s,x) && contains(t,x) }

  /**
    * Returns the difference of the two given sets,
    * the set of all elements of `s` that are not in `t`.
    *
    * Here both s and t are functions, and diff return another function(x)
    */
  def diff(s: Set, t: Set): Set = { x => contains(s,x) && !contains(t,x) }

  /**
    * Returns the subset of `s` for which `p` holds.
    *
    * Here both s and p are functions, and filter return another function(x)
    */
  def filter(s: Set, p: Int => Boolean): Set = { x => contains(s,x) && contains(p,x) }


  /**
    * The bounds for `forall` and `exists` are +/- 1000.
    */
  val bound = 1000

  /**
    * Returns whether all bounded integers within `s` satisfy `p`.
    */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (???) ???
      else if (???) ???
      else iter(???)
    }
    iter(???)
  }

  /**
    * Returns whether there exists a bounded integer within `s`
    * that satisfies `p`.
    */
  def exists(s: Set, p: Int => Boolean): Boolean = ???

  /**
    * Returns a set transformed by applying `f` to each element of `s`.
    */
  def map(s: Set, f: Int => Int): Set = ???

  /**
    * Displays the contents of a set
    */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
    * Prints the contents of a set on the console.
    */
  def printSet(s: Set) {
    println(toString(s))
  }
}
