@file:JvmName("MainKotlin")

package org.jonnyzzz.demo

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock


data class UserMessage(val name: String?,
                       val hello: String)


/*

val q : Nothing = TODO()
val z : String = q
val y : Any = z
val x : Any? = x

*/

fun findUser(name: String) : UserMessage? = TODO()

fun findAllUsers() : List<UserMessage> = TODO()

fun groupUsers() {

  val helloToUsers = findAllUsers()
          .filter { it.name?.length ?:0 > 5 }
          .groupBy { it.hello }

}


fun searchForHello(name: String) : String? {
  return null
}

fun guessHello(name: String): String {

  val result = searchForHello(name)
  if (result != null) {
    return result
  }

  if (System.currentTimeMillis() > 0) return "Servus"

  if (name == "jonnyzzz") return "Privet"
  if (name == "devoxx") return "Hi"

  return "Hello"
}


fun helloMessage(name: String,
                 hello: String = guessHello(name)
) = "$hello, ${name.capitalize()}!"

fun main(args: Array<String>) {
  println(helloMessage(
          hello = "Privet",
          name = "Devoxx"
  )
  )

  for (arg in args) {

    println(
            helloMessage(arg.hello)
    )
  }

  val x : String? = null

}


object WithLockInJava {


  inline fun <T> withLock(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
      return action()
    } finally {
      lock.unlock()
    }
  }


  @JvmStatic
  fun main(args: Array<String>) {

    val l = ReentrantLock()

    withLock(l) {
      doSomeWorkWithLock()
      doSomeWorkWithLock()
    }
  }



  private fun doSomeWorkWithLock() {

  }
}