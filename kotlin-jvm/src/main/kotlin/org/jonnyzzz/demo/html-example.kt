package org.jonnyzzz.demo

import kotlinx.html.*
import kotlinx.html.stream.createHTML

val html = buildString {

  createHTML().


          html {
            head {
              title = "Title"
            }
            body {
              h1 { +"Hello!" }

              +"This is a most"
              +"trivial page"
              strong { +"ever" }
            }
          }

}