package corp.jpa;


import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class CorpUser {
  private String name;
  private String hi;

  public CorpUser() {
  }

  public CorpUser(String name, String hi) {
    this.name = name;
    this.hi = hi;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Nullable
  public String getHi() {
    return hi;
  }

  public void setHi(String hi) {
    this.hi = hi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CorpUser corpUser = (CorpUser) o;
    return Objects.equals(name, corpUser.name) &&
            Objects.equals(hi, corpUser.hi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hi);
  }

  @Override
  public String toString() {
    return "CorpUser{" +
            "name='" + name + '\'' +
            ", hi='" + hi + '\'' +
            '}';
  }
}



