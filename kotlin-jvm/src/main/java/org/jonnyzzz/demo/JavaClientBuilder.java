package org.jonnyzzz.demo;

import org.jetbrains.annotations.NotNull;

public class JavaClientBuilder {
  private String myName;
  private String myLastName;
  private String myCompany;
  private String myTwitter;

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

  public String getCompany() {
    return myCompany;
  }

  public void setCompany(String company) {
    myCompany = company;
  }

  public String getTwitter() {
    return myTwitter;
  }

  public void setTwitter(String twitter) {
    myTwitter = twitter;
  }

  @NotNull
  public JavaClient build() {
    return new JavaClient(myName, myLastName, myCompany, myTwitter);
  }
}
