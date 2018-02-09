package org.jonnyzzz.demo;

public class JavaClient {
  private final String myFirstName;
  private final String myLastName;
  private final JavaCompany myCompany;
  private final JavaTwitter myTwitter;

  public JavaClient(String firstName, String lastName, JavaCompany company, JavaTwitter twitter) {
    myFirstName = firstName;
    myLastName = lastName;
    myCompany = company;
    myTwitter = twitter;
  }

  public String getFirstName() {
    return myFirstName;
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

  public String getHelloMessage() {
    return "Foo";
  }
}
