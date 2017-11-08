package org.jonnyzzz.demo


fun main(args: Array<String>) {
  println("Hello, KUG München!")

  val client = buildClient {
    name { "Eugene" % "Petrenko" }

    twitter {
      handle = "@jonnyzzz"
    }

    company {
      "JetBrains" from "Munich"
    }
  }

  println("Created client is: " + client.pres )
}

private infix fun String.from(s: String) {

}

fun buildClient(setup : JavaClientBuilder.() -> Unit) : JavaClient {
  val builder = JavaClientBuilder()
  setup(builder)
  return builder.build()
}

fun buildTwitter(setup: JavaTwitterBuilder.() -> Unit) = JavaTwitterBuilder().apply(setup).build()
fun buildCompany(setup: JavaCompanyBuilder.() -> Unit) = JavaCompanyBuilder().apply(setup).build()

fun JavaClientBuilder.twitter(setup: JavaTwitterBuilder.() -> Unit) {
  twitter = buildTwitter(setup)
}

fun JavaClientBuilder.company(setup: JavaCompanyBuilder.() -> Unit) {
  company = buildCompany(setup)
}

fun JavaClient.pres() = "${this.firstName} $lastName  ${twitter.handle}"

val JavaClient.pres
  get() = pres()




