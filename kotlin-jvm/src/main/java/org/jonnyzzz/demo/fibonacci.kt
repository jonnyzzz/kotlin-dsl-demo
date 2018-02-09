package org.jonnyzzz.demo

import kotlin.coroutines.experimental.buildSequence

fun fibonacci() = buildSequence {
  var terms = Pair(0, 1)

  // this sequence is infinite
  while(true) {
    yield(terms.first)
    terms = Pair(terms.second, terms.first + terms.second)
  }
}

fun main(args: Array<String>) {
  println(fibonacci().take(10).toList())
}
