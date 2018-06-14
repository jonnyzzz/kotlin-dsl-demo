package corp.model;

import org.jetbrains.annotations.NotNull;

public class JavaClientBuilder {
  private String myFirstName;
  private String myLastName;
  private JavaCompany myCompany;
  private JavaTwitter myTwitter;

  public String getFirstName() {
    return myFirstName;
  }

  public void setFirstName(String firstName) {
    myFirstName = firstName;
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
    return new JavaClient(myFirstName, myLastName, myCompany, myTwitter);
  }
}
