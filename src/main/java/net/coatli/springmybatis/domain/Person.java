package net.coatli.springmybatis.domain;

import java.util.UUID;

public class Person {

  private final String key;
  private String firstName;
  private String lastName;
  private Integer age;
  private Address address;

  public Person() {
    this.key = UUID.randomUUID().toString();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(final Integer age) {
    this.age = age;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public String getKey() {
    return key;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).appendSuper(super.toString()).append("key", key).append("firstName", firstName).append("lastName", lastName).append("age", age).append("address", address).toString();
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Person)) {
      return false;
    }
    final Person castOther = (Person) other;
    return new EqualsBuilder().append(key, castOther.key).append(firstName, castOther.firstName).append(lastName, castOther.lastName).append(age, castOther.age).append(address, castOther.address).isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(key).append(firstName).append(lastName).append(age).append(address).toHashCode();
  }

}
