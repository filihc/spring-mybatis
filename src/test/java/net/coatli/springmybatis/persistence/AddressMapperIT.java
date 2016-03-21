package net.coatli.springmybatis.persistence;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import net.coatli.springmybatis.config.RootContextConfiguration;
import net.coatli.springmybatis.domain.Address;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootContextConfiguration.class)
@Transactional
public class AddressMapperIT {

  @Autowired
  private AddressMapper mapper;

  @Test
  public void thatCreateWorks() {
    // given
    final Address address = new Address(20);
    address.setStreet("Open Boulevard");

    // when
    final int rowsInserted = mapper.create(address);

    // then
    assertTrue(rowsInserted == 1);
  }

  @Test
  public void thatReadWorks() {
    // given
    final Integer addressKey = 10;

    // when
    final Address address = mapper.read(addressKey);

    // then
    assertNotNull(address);
  }

  @Test
  public void thatUpdateWorks() {
    // given
    final Address address = new Address(10);
    address.setStreet("Hollywood Boulevard");

    // when
    final int rowsUpdated = mapper.update(address);

    // then
    assertTrue(rowsUpdated == 1);
  }

  @Test
  public void thatDeleteWorks() {
    // given
    final Address address = new Address(10);

    // when
    final int rowsDeleted = mapper.delete(address);

    // then
    assertTrue(rowsDeleted == 1);
  }

  @Test
  public void thatReadAllWorks() {
    // given
    final Address filters = new Address(null);
    filters.setStreet("ma");

    // when
    final List<Address> allAddresses = mapper.readAll(filters);

    // then
    assertFalse(allAddresses.isEmpty());
  }

}
