package org.jonnyzzz.demo

import corp.jpa.DBConnectionUtil


fun main(args: Array<String>) {
  println("Hello, Prague!")


  println("Starting the application...")


  DBConnectionUtil.runWithConnection {
    it.doTheBestQuery()


    println("Running the action with connection: $it")
    null
  }

  println("All set!")
}

