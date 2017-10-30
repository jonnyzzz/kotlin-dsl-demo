package org.jonnyzzz.demo;

public class JavaCompanyBuilder {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JavaCompany build() {
    return new JavaCompany(name);
  }
}
