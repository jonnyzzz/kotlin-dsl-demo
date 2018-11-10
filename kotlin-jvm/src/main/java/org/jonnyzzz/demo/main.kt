@file:JvmName("MainKotlin")
package org.jonnyzzz.demo

fun main(args: Array<String>) {
  println(helloMessage("Devoxx"))

  for (arg in args) {

    println(
            helloMessage(arg.hello)
    )
  }
}

