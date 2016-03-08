package net.coatli.springmybatis.domain;

import java.util.UUID;

public class Person {

  private final String key;
  private final String name;
  private Integer age;
  private Address address;

  public Person(final String name) {
    this.key = UUID.randomUUID().toString();
    this.name = name;
  }

  public Person(final String key, final String name) {
	this.key = key;
	this.name = name;
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

  public String getName() {
    return name;
  }
}
