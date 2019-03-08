package corp.model;

public class JavaCompanyBuilder {
  private String myName;
  private String myCity;

  public String getName() {
    return myName;
  }

  public void setName(String name) {
    this.myName = name;
  }

  public String getCity() {
    return myCity;
  }

  public void setCity(String city) {
    myCity = city;
  }

  public JavaCompany build() {
    return new JavaCompany(myName, myCity);
  }
}
