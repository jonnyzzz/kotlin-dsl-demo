package org.jonnyzzz.demo

fun main(args: Array<String>) {

  listOf("A")
          .asSequence()
          .map { it.length }
          .filter { it > 0 }
          .toSet()
          .joinToString()


}


