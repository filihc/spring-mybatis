package net.coatli.springmybatis.persistence;

import static org.junit.Assert.assertTrue;

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
    final Address address = new Address();
    address.setKey(20);
    address.setStreet("Open Boulevard");

    // when
    final int rowsInserted = mapper.create(address);

    // then
    assertTrue(rowsInserted == 1);
  }
}
