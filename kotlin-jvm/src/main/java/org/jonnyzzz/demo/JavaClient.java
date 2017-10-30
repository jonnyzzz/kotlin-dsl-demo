package org.jonnyzzz.demo;

public class JavaClient {
  private final String myName;
  private final String myLastName;
  private final JavaCompany myCompany;
  private final JavaTwitter myTwitter;

  public JavaClient(String name, String lastName, JavaCompany company, JavaTwitter twitter) {
    myName = name;
    myLastName = lastName;
    myCompany = company;
    myTwitter = twitter;
  }

  public String getName() {
    return myName;
  }

  public String getLastName() {
    return myLastName;
  }

  public JavaCompany getCompany() {
    return myCompany;
  }

  public JavaTwitter getTwitter() {
    return myTwitter;
  }
}
