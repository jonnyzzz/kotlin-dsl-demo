package org.jonnyzzz.demo


fun main(args: Array<String>) {

  DSLs.talk {
    + liveCoding
    and IntelliJ IDEA
  } in 42.m


}

private val Any.m: Any
  get() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

private operator fun Any.contains(talk: Unit): Boolean {
  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

object liveCoding {
  operator fun unaryPlus() {
  }
}

object IDEA

object DSLs {
  fun talk(x:DSLs.() -> Unit) = Unit

      infix fun IntelliJ(x:IDEA) = 42
  val and: DSLs = this
}