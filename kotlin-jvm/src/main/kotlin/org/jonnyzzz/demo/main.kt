package org.jonnyzzz.demo


fun main(args: Array<String>) {
  ConsolePrinter {
    
    "KUG München".markdownHello()



    + helloMessage(
            hello = "Servus",
            name = "KUG München")

    iterateNames(args) {

      indent {
        +"foo"
        +hi
        +"bar"
      }
      
    }
  }
}

fun Printer.indent(f: Printer.() -> Unit){
  object: Printer {
    override fun line(text: String) = this@indent.line("  " + text)
  }.f()
}

infix operator fun Printer.invoke(f: Printer.() -> Unit) {
  f()
}


fun iterateNames(names: Array<String>, f: String.() -> Unit) {
  for (arg in names) {
    arg.f()
  }
}


interface Printer {
  fun line(text: String = "")

  operator fun String.unaryPlus() {
    line(this)
  }

  fun String.markdownHello() {
    val text = this.hi
    line(text)
    line("=".repeat(text.length))
    line()
  }
}

object ConsolePrinter : Printer {
  override fun line(text: String) {
    println(text)

    val builder = JavaClientBuilder().apply {
      name = "Eugene"
      lastName = "Petrenko"
      twitter = "@jonnyzzz"
      company = "JetBrains"
    }

    val client = builder.build()

    println("Created client is: " + client)

  }
}


fun helloMessage(name: String,
                 hello: String = "Hello") = "$hello, $name!"


fun String.hi(hello: String = "Hello") = helloMessage(this, hello)

val String.hi
  get() = hi()




