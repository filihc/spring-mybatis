package net.coatli.springmybatis.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Address {

  private static final Logger LOGGER = LoggerFactory.getLogger(Address.class);

  private final Integer key;
  private String street;
  private Integer number;

  public Address(final Integer key) {
    this.key = key;

    LOGGER.info("new Address - key: {}", key);
  }

  public Integer getKey() {
    return key;
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

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).appendSuper(super.toString()).append("key", key)
        .append("street", street).append("number", number).toString();
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Address)) {
      return false;
    }
    final Address castOther = (Address) other;
    return new EqualsBuilder().append(key, castOther.key).append(street, castOther.street)
        .append(number, castOther.number).isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(key).append(street).append(number).toHashCode();
  }

}
