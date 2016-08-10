package com.liang.atl

/**
  * Created by lxx2 on 7/20/2016.
  */

// simple trait and case class
trait Expr

case class Number(n: Int) extends Expr

case class Sum(e1: Expr, e2: Expr) extends Expr


/// define companion objects (actually functions),
object Number {
  def apply(n: Int) = new Number(n) /// call Number class
}

object Sum {
  def apply(e1: Expr, e2: Expr) = new Sum(e1, e2) /// call Sum class
}


/// Evaluation
object Eval{
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1,e2) => eval(e1) + eval(e2)
  }
}
