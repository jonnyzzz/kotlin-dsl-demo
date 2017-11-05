package org.jonnyzzz.demo;

public class JavaCompany {
  private final String myName;
  private final String myCity;

  public JavaCompany(String name, String city) {
    myName = name;
    myCity = city;
  }

  public String getName() {
    return myName;
  }

  public String getCity() {
    return myCity;
  }
}
