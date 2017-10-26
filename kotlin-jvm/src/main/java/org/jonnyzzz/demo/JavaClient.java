package org.jonnyzzz.demo;

import org.jetbrains.annotations.NotNull;

public class JavaClient {
  private final String myName;
  private final String myLastName;
  private final String myCompany;
  private final String myTwitter;

  public JavaClient(String name, String lastName, String company, String twitter) {
    myName = name;
    myLastName = lastName;
    myCompany = company;
    myTwitter = twitter;
  }

  @NotNull
  public String getName() {
    return myName;
  }

  @NotNull
  public String getLastName() {
    return myLastName;
  }

  @NotNull
  public String getCompany() {
    return myCompany;
  }

  @NotNull
  public String getTwitter() {
    return myTwitter;
  }
}
