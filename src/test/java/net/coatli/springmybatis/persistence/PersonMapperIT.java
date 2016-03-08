package net.coatli.springmybatis.persistence;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import net.coatli.springmybatis.config.RootContextConfiguration;
import net.coatli.springmybatis.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootContextConfiguration.class)
@Transactional
public class PersonMapperIT {

  @Autowired
  private PersonMapper mapper;

  @Test
  public void thatCreateWorks() {
    // given
    final Person person = new Person("Puffy");

    // when
    final int rowsInserted = mapper.create(person);

    // then
    assertTrue(rowsInserted == 1);
  }
}
