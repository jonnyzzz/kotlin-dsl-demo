package org.jonnyzzz.demo

fun main(args: Array<String>) {
  ConsolePrinter.apply {
    line()

    html {
      body {
        div {
          + "fooo"
        }
        div {
          + "fooo"
        }
      }
    }
  }
}

interface Printer {
  fun line(text: String = "")

  operator fun String.unaryPlus() = line(this)
}

object ConsolePrinter : Printer {
  override fun line(text: String) {
    println(text)
  }
}

fun Printer.block(name : String, internalsBuidler : Printer.() -> Unit) {
  line("<$name>")

  object : Printer {
    override fun line(text: String) {
      this@block.line("  " + text)
    }
  }.internalsBuidler()

  line("</$name>")
}


fun Printer.html(builder : Printer.() -> Unit) = block("html", builder)
fun Printer.body(builder : Printer.() -> Unit) = block("body", builder)
fun Printer.div(builder : Printer.() -> Unit) = block("div", builder)
