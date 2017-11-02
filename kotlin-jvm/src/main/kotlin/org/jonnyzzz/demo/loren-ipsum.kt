@file:Suppress("UNUSED_PARAMETER", "unused", "FunctionName", "PropertyName")

package org.jonnyzzz.demo.lorenIpsum


fun main(args: Array<String>) {
  `loren ipsum` {
    
    Lorem ipsum dolor sit amet `,` consectetur adipiscing elit. Ut pretium
    lorem felis `,`
  }
}

fun `loren ipsum`(builder : LorenIpsum.() -> Unit) {
}

interface Term {
  infix operator fun invoke(r: Term) = this
}

object Lorem : Term
object lorem : Term
object dolor : Term
object amet : Term
object consectetur : Term
object elit : Term
object felis : Term
object posuere : Term
object `,` : Term
object et : Term
object pharetra : Term
object nisi : Term
object ornare : Term
object nisl : Term
object nec : Term
object scelerisque : Term

val Term.Ut get() = this
val Term.Sed get() = this


class LorenIpsum {
  infix fun Term.ipsum(t : Term) = this
  infix fun Term.dolor(t : Term) = this
  infix fun Term.sit(t : Term) = this
  infix fun Term.`,`(t : Term) = this
  infix fun Term.adipiscing(t : Term) = this
  infix fun Term.pretium(t : Term) = this
  infix fun Term.felis(t : Term) = this
  infix fun Term.Sed(t : Term) = this
  infix fun Term.posuere(t : Term) = this
  infix fun Term.commodo(t : Term) = this
  infix fun Term.metus(t : Term) = this
  infix fun Term.nisl(t : Term) = this
  infix fun Term.elementum(t : Term) = this
  infix fun Term.massa(t : Term) = this
  infix fun Term.turpis(t : Term) = this
}

