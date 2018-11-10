package org.jonnyzzz.demo

fun helloMessage(name: String, hello: String = "Hello") = "${hello.capitalize()}, ${name.capitalize()}!"

fun String.hello() = "Hello, $this!"

val String.hello
  get() = "Hello, $this!"


fun main(args: Array<String>) {
  println(helloMessage("Devoxx"))

  for (arg in args) {

    println(
            helloMessage(arg.hello)
    )
  }
}

