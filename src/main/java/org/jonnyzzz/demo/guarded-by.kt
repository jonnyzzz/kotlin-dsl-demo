@file:Suppress("MemberVisibilityCanPrivate")

package org.jonnyzzz.demo

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class Guarded<out T>(
        val value: T,
        val lock: Lock = ReentrantLock()
) {

  inline operator fun <R> invoke(action: T.() -> R) =
          lock.withLock {
            value.action()
          }
}

class State {
  var runningTasks = 0
  var shutdown = false
}

class WithLock {
  val guarded = Guarded(State())

  fun usage() {
    guarded {
      if (!shutdown) {
        runningTasks++
      }
    }
  }
}


class Usage {
  val x = State()
  val y = WithLock().usage()
}