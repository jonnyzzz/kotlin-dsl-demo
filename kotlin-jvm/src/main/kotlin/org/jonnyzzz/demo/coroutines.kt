package org.jonnyzzz.demo

import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.suspendCancellableCoroutine
import kotlin.concurrent.thread


fun main(args: Array<String>) {
  runBlocking {
    `suspend fun`()
  }
}

suspend fun `suspend fun`() {

  println("on start: " + Thread.currentThread())
  callWithResult()
  println("on end: " + Thread.currentThread())
}

suspend fun callWithResult() = suspendCancellableCoroutine<String> { cont ->
  someLongRunningAsyncAction(object : ActionListener<String> {
    override fun onResponse(response: String) = cont.resume(response)
    override fun onFailure(e: Exception) = cont.resumeWithException(e)
  })
}

interface ActionListener<Response> {
  fun onResponse(response: Response)
  fun onFailure(e: Exception)
}

fun someLongRunningAsyncAction(r: ActionListener<String>) {
  thread(name = "callback thread!") {
    println("on callback: " + Thread.currentThread())
    r.onResponse("hohoho!")
  }
}
