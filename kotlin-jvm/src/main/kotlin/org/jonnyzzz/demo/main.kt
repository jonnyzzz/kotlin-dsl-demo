package org.jonnyzzz.demo


fun main(args: Array<String>) {
  println("Hello, KUG München!")


  val client = buildClient {
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


val JavaClient.hash
  get() = hash()

fun JavaClient.hash(): String {
  return if (company != null) name + "#" + lastName else "OOIPS"
}


fun buildCompany(b: JavaCompanyBuilder.() -> Unit) = JavaCompanyBuilder().apply(b).build()
fun buildTwitter(b: JavaTwitterBuilder.() -> Unit) = JavaTwitterBuilder().apply(b).build()

fun buildClient(b: JavaClientBuilder.() -> Unit): JavaClient {
  val builder = JavaClientBuilder()
  b(builder)
  return builder.build()
}


fun JavaClientBuilder.company(b: JavaCompanyBuilder.() -> Unit) = buildCompany(b)
fun JavaClientBuilder.twitter(b: JavaTwitterBuilder.() -> Unit) = buildTwitter(b)

