package org.jonnyzzz.demo.jdom

import org.jonnyzzz.kotlin.xml.bind.*
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML
import org.jonnyzzz.kotlin.xml.bind.jdom.XUnknown
import org.jonnyzzz.kotlin.xml.dsl.jdom.jdom


class Example {
  //declares a property of type String that load data from "ROOT/aaa/ggg/text()"
  var content by JXML / "aaa" / "ggg" / XText

  //same, but for attribute value
  var attribute by JXML / "aaa" / XAttribute("yohoho")

  //parses sub-object fields
  var sub by JXML / "sub" / XSub(Sub::class.java)

  //collection (aka List<>) of strings is loaded here
  var collection by JXML / "parameters" / XElements("param") / "aaa" / XText

  //collection (aka List<>) of sub objects
  var any by JXML / "parameters" / XAnyElements / XSub(Sub::class.java)
}


class Sub {
  // [2] --- allows to define persist order
  var key by JXML[2] / XAttribute("key")

  // this specifies default value
  var value by JXML[1] / XAttribute("value") - "defaultValue"

  // sometimes a part of XML should be loaded as-is. Type is org.jdom.Element
  var unknown by JXML / XUnknown
}

fun main(args: Array<String>) {
  val DOM = jdom("root-element-name") {
    attribute("attribute", "42")
    element("some-other-element")
    text("Hello World")
  }
  println( DOM)
}
