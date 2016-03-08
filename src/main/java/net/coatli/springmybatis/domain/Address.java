package net.coatli.springmybatis.domain;

public class Address {

  private Integer key;
  private String street;
  private Integer number;

  public Address() {
  }

  public Integer getKey() {
    return key;
  }

  public void setKey(final Integer key) {
    this.key = key;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(final String street) {
    this.street = street;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(final Integer number) {
    this.number = number;
  }

}
