package net.coatli.springmybatis.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Ticket {

  public final String key;
  public final Date dateCreated;
  public Person person;

  public Ticket() {
    this.key = UUID.randomUUID().toString();
    this.dateCreated = Calendar.getInstance().getTime();
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(final Person person) {
    this.person = person;
  }

  public String getKey() {
    return key;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).appendSuper(super.toString()).append("key", key).append("dateCreated", dateCreated).append("person", person).toString();
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Ticket)) {
      return false;
    }
    final Ticket castOther = (Ticket) other;
    return new EqualsBuilder().append(key, castOther.key).append(dateCreated, castOther.dateCreated).append(person, castOther.person).isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(key).append(dateCreated).append(person).toHashCode();
  }

}
