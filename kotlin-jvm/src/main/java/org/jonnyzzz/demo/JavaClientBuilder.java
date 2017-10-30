package org.jonnyzzz.demo;

import org.jetbrains.annotations.NotNull;

public class JavaClientBuilder {
  private String myName;
  private String myLastName;
  private JavaCompany myCompany;
  private JavaTwitter myTwitter;

  public String getName() {
    return myName;
  }

  public void setName(String name) {
    myName = name;
  }

  public String getLastName() {
    return myLastName;
  }

  public void setLastName(String lastName) {
    myLastName = lastName;
  }

  public JavaCompany getCompany() {
    return myCompany;
  }

  public void setCompany(JavaCompany company) {
    myCompany = company;
  }

  public JavaTwitter getTwitter() {
    return myTwitter;
  }

  public void setTwitter(JavaTwitter twitter) {
    myTwitter = twitter;
  }

  @NotNull
  public JavaClient build() {
    return new JavaClient(myName, myLastName, myCompany, myTwitter);
  }
}
