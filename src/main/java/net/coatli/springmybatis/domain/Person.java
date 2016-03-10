package net.coatli.springmybatis.domain;

import java.util.UUID;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

  private static final Logger LOGGER = LoggerFactory.getLogger(Person.class);

  private final String key;
  private final String name;
  private Integer age;
  private Address address;

  public Person(final String name) {
    this.key = UUID.randomUUID().toString();
    this.name = name;

    LOGGER.info("new Person - key: {}, name: {}", key, name);
  }

  public Person(final String key, final String name) {
  	this.key = key;
  	this.name = name;

  	LOGGER.info("new Person - key: {}, name: {}", key, name);
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

    LOGGER.info("setting Address: {}", address);
  }

  public String getKey() {
    return key;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).appendSuper(super.toString()).append("key", key)
        .append("name", name).append("age", age).append("address", address).toString();
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Person)) {
      return false;
    }
    final Person castOther = (Person) other;
    return new EqualsBuilder().append(key, castOther.key).append(name, castOther.name).append(age, castOther.age)
        .append(address, castOther.address).isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(key).append(name).append(age).append(address).toHashCode();
  }


}
