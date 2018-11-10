package corp.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WithLockInJava {

  interface WithLockAction<T> {
    T execute();
  }

  public static <T> T withLock(final Lock lock, final WithLockAction<T> action) {
    lock.lock();
    try {
      return action.execute();
    } finally {
      lock.unlock();
    }
  }




  public static void main(String[] args) {

    final Lock l = new ReentrantLock();

    withLock(l, () -> {
      doSomeWorkWithLock();
      doSomeWorkWithLock();

      return 42;
    });
  }










  interface WithLockCallback {
    void execute();
  }

  public static void withLock(final Lock lock, final WithLockCallback action) {
    lock.lock();
    try {
      action.execute();
    } finally {
      lock.unlock();
    }
  }




  private static void doSomeWorkWithLock() {

  }
}
