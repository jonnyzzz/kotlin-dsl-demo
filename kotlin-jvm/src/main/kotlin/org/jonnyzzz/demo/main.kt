package org.jonnyzzz.demo

import java.math.BigDecimal
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock


fun main(args: Array<String>) {
  println("Hello, KUG München!")

  val client = buildClient {
    name = "Eugene"
    lastName = "Petrenko"

    twitter {
      handle = "@jonnyzzz"
    }

    company {
      name = "JetBrains"
    }
  }

  println("Created client is: " + client)
}


fun buildClient(f: JavaClientBuilder.() -> Unit): JavaClient {
  val builder = JavaClientBuilder()
  f(builder)
  return builder.build()
}

fun buildTwitter(f: JavaTwitterBuilder.() -> Unit) = JavaTwitterBuilder().run { f(); build() }
fun buildComplany(f: JavaCompanyBuilder.() -> Unit) = JavaCompanyBuilder().run { f(); build() }


fun JavaClientBuilder.twitter(f: JavaTwitterBuilder.() -> Unit) {
  twitter = buildTwitter(f)
}

fun JavaClientBuilder.company(f: JavaCompanyBuilder.() -> Unit) {
  company = buildComplany(f)
}



class GuardedByLock<out T: Any>(
        @PublishedApi internal val state : T,
        @PublishedApi internal val lock : Lock = ReentrantLock()
) {
  inline operator fun <R> invoke(f : T.() -> R): R = lock.withLock {
    state.f()
  }
}

class ClassThatUsesLock {
  val guardedState = GuardedByLock(HashMap<String, String>())

  fun useValue() {
    guardedState {
      put("kotlin", "rocks!")
    }
  }
}


val Int.bd get() = BigDecimal(this)
