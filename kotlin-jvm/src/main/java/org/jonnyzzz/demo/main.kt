@file:JvmName("MainKotlin")

package org.jonnyzzz.demo


fun searchForHello(name: String) : String? {
  return null
}

fun guessHello(name: String): String {

  val result = searchForHello(name)
  if (result != null) {
    return result
  }

  if (System.currentTimeMillis() > 0) return "Servus"

  if (name == "jonnyzzz") return "Privet"
  if (name == "devoxx") return "Hi"

  return "Hello"
}


fun helloMessage(name: String,
                 hello: String = guessHello(name)
) = "$hello, ${name.capitalize()}!"

fun main(args: Array<String>) {
  println(helloMessage(
          hello = "Privet",
          name = "Devoxx"
  )
  )

  for (arg in args) {

    println(
            helloMessage(arg.hello)
    )
  }

  val x : String? = null

}

