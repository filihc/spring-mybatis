package net.coatli.springmybatis.persistence;

import net.coatli.springmybatis.domain.Person;

public interface PersonMapper {

  public String create(Person person);

  public Person read(String key);

  public void update(Person person);

  public void delete(Person person);
}
