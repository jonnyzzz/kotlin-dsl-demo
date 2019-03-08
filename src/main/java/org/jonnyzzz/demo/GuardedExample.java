package org.jonnyzzz.demo;

import java.util.concurrent.locks.Lock;

public class GuardedExample {

  @GuardedBy("theLock")
  private String state;

  private Lock theLock;


  void seeAlso() {
//    com.google.common.cache.LocalCache.Segment.drainKeyReferenceQueue();
  }

}

