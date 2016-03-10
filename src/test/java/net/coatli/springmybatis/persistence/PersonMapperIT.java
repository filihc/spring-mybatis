package net.coatli.springmybatis.persistence;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

  private static final Logger LOGGER
      = LoggerFactory.getLogger(PersonMapperIT.class);

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

  @Test
  public void thatReadWorks() {
    // given
    final String personKey = "34d22929-c471-43b4-b36f-fcfbc4dd4c30";

    // when
    final Person person = mapper.read(personKey);

    // then
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("person readed: {}", person);
    }
    assertTrue(personKey.equals(person.getKey()));
  }

  @Test
  public void thatUpdateWorks() {
    // given
    final Person person
      = new Person("34d22929-c471-43b4-b36f-fcfbc4dd4c30", "Fernando Benitez");

    // when
    final int rowsUpdated = mapper.update(person);

    // then
    assertTrue(rowsUpdated == 1);
  }

  @Test
  public void thatDeleteWorks() {
    // given
    final Person person = new Person("34d22929-c471-43b4-b36f-fcfbc4dd4c30", null);

    // when
    final int rowsDeleted = mapper.delete(person);

    // then
    assertTrue(rowsDeleted == 1);
  }

  @Test
  public void thatReadWithAddress4ExistingAddressWorks() {
    // given
    final String personKey = "a265fa43-6a13-4823-bec1-cc236489fb30";

    // when
    final Person person = mapper.readWithAddress(personKey);

    // then
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("with address: {}", person);
    }
    assertTrue(person.getAddress() != null);
  }

  @Test
  public void thatReadWithAddress4NotExistingAddressWorks() {
    // given
    final String personKey = "34d22929-c471-43b4-b36f-fcfbc4dd4c30";

    // when
    final Person person = mapper.readWithAddress(personKey);

    // then
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("without address: {}", person);
    }
    assertTrue(person.getAddress() == null);
  }
}
