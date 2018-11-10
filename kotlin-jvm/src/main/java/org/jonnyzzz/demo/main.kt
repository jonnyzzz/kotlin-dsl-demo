@file:JvmName("MainKotlin")
package org.jonnyzzz.demo

fun helloMessage(name: String) : String {
  return "Hello, $name!"
}

fun String.hello() : String {
  return "Hello, $this!"
}

val String.hello
  get() : String {
    return "Hello, $this!"
  }

fun main(args: Array<String>) {
  println(helloMessage("Devoxx"))

  for (arg in args) {

    println(
            arg.hello
    )
  }

}

