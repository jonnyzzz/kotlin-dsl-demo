package org.jonnyzzz.demo


fun main(args: Array<String>) {
  println("Hello, Devoxx")

  val client = `create the client` {

    firstName = "Eugene"
    lastName = "Petrenko"

    twitter {
      handle = "@jonnyzzz"
    }

    company {
      name = "JetBrains"
      city = "Munich"
    }
  }
  println("Created client is: " + client.consoleString )

}

fun JavaClientBuilder.twitter(s: JavaTwitterBuilder.() -> Unit) {
  twitter = JavaTwitterBuilder().apply(s).build()
}

fun JavaClientBuilder.company(s: JavaCompanyBuilder.() -> Unit) {
  company = JavaCompanyBuilder().apply(s).build()
}


fun `create the client`(s: JavaClientBuilder.() -> Unit) : JavaClient {
  val builder = JavaClientBuilder()

  builder.s()

  return builder.build()

}

fun JavaClient.toConsoleString() =
  "${twitter.handle} ${company.name}"

val JavaClient.consoleString
   get() =  "${twitter.handle} ${company.name}"


fun print(client: JavaClient)
        = "${client.twitter.handle} ${client.company.name}"




