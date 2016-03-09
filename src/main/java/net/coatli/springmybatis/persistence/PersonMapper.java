package net.coatli.springmybatis.persistence;

import net.coatli.springmybatis.domain.Person;

public interface PersonMapper extends CrudMapper<Person, String> {

  public Person readWithAddress(String key);
}
