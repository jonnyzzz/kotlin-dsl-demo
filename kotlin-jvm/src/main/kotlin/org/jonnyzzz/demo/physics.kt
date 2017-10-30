package org.jonnyzzz.demo

object Mass
object Time



val m = Mass
val s = Time



val furmula =  10 * m / s


operator fun <A, B> A.times(m: B) = OpMul(this, m)
operator fun <A, B> A.div(m: B) = OpDiv(this, m)

operator fun <A> A.plus(m: A) = OpPlus(this, m)
operator fun <A> A.minus(m: A) = OpMinus(this, m)

open class Op<A, B>(val a: A, val b: B)
class OpDiv<A, B>(a: A, b: B) : Op<A,B>(a, b)
class OpMul<A, B>(a: A, b: B) : Op<A,B>(a, b)

class OpPlus<A>(a: A, b: A): Op<A,A>(a,b)
class OpMinus<A>(a: A, b: A): Op<A,A>(a,b)

