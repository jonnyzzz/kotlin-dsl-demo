package org.jonnyzzz.demo


fun main(args: Array<String>) {
  println("Hello, KUG München!")



  val client = buildClient {

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

  println("Created client is: " + client.forConsole   )
}

fun JavaClientBuilder.twitter(setup : JavaTwitterBuilder.() -> Unit) {
  twitter = JavaTwitterBuilder().apply(setup).build()
}

fun JavaClientBuilder.company(setup : JavaCompanyBuilder.() -> Unit) {
  company = JavaCompanyBuilder().apply(setup).build()
}

fun buildClient(setup: JavaClientBuilder.() -> Unit): JavaClient {
  val builder = JavaClientBuilder()

  builder.setup()

  return builder.build()
}

fun present(client: JavaClient)
        = "JavaClient{${client.twitter.handle} ${client.company.name}}"


fun JavaClient.forConsole()
        = "JavaClient{${twitter.handle} ${company.name}}"

val JavaClient.forConsole
  get() = "JavaClient{${twitter.handle} ${company.name}}"

