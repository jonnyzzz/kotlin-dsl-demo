package org.jonnyzzz.demo

import org.jonnyzzz.demo.math.plus

object Foo

fun main(args: Array<String>) {
  println("Hello, KUG München!")

  val client = createClient {

    Foo {

    }

    name = "Eugene"
    lastName = "Petrenko"

    twitter {
      handle = "@jonnyzzz"
    }

    company {
      name = "JetBrains"
    }
  }

  println("Created client is: " + client.hash )
}

operator fun Foo.invoke(f: () -> Unit) {

  val x = f + f

}

fun JavaClient.hash() = "$name@$twitter"

interface JavaClientBuilder2 {
  var name : String
  var lastName : String


  fun twitter(f : JavaTwitterBuilder.() -> Unit) {
    twitter = createTwitter(f)
  }

  fun company(f : JavaCompanyBuilder.() -> Unit)

}
inline  infix fun Boolean.`or or of`(s : () -> Boolean )

infix fun Int.bar(s : Boolean)

infix fun String.foo(s : (Int) -> Unit) {

  (42 shl 3 == 3) `or or of`  { true  }

}

interface fun createClient(builder: JavaClientBuilder2.() -> Unit ) : JavaClient {
  val factory = object: JavaClientBuilder2 {

    fun company(f : JavaCompanyBuilder.() -> Unit) {
      company = createCompany(f)
    }
  }
  factory.builder()
  return factory.build()
}

fun createTwitter(builder: JavaTwitterBuilder.() -> Unit)
        = JavaTwitterBuilder().apply(builder).build()

fun createCompany(builder: JavaCompanyBuilder.() -> Unit)
        = JavaCompanyBuilder().apply(builder).build()



fun hashcode(client: JavaClient) = "${client.name}@${client.twitter}"


val JavaClient.hash
  get() = "$name@$twitter"







