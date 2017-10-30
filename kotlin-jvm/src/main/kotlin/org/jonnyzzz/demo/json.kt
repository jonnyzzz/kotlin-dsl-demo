package org.jonnyzzz.demo

import kotlinx.html.*
import kotlinx.html.stream.appendHTML

interface JSONObjectGenerator {

  operator fun String.rem(s: String)
  operator fun String.rem(gen: JSONObjectGenerator.() -> Unit)
}

fun generateJSON(gen: JSONObjectGenerator.() -> Unit) {


}


fun main(args: Array<String>) {
  generateJSON {

    "name" % "jonnyzzz"

    "notebook" % {
      "os" % "macOS"
    }

  }

  //kotlinx.html

  println(buildString {
    appendln()

    appendHTML().html {
      head {
        title = "Hello"
      }
      body {
        h1 { + "Woohoo!" }

        fooo()
      }
    }

  })
}

private fun BODY.fooo() {
  div {
    span { +"Dib!" }
  }
}

