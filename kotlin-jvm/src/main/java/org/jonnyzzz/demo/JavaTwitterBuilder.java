package org.jonnyzzz.demo;

public class JavaTwitterBuilder {
  private String handle;

  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public JavaTwitter build() {
    return new JavaTwitter(handle);
  }
}
