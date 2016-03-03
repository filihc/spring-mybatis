package net.coatli.springmybatis.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({ "mx.com.segurosatlas.vidauniversal.model.persistence" })
@PropertySource(value = { "classpath:application.properties" })
public class RootContextConfiguration {

  @Autowired
  private Environment environment;

  @Bean
  public SqlSessionFactoryBean sessionFactory() {
    final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

    sessionFactory.setDataSource(dataSource());
    sessionFactory.setTypeAliasesPackage("net.coatli.springmybatis.domain");

    return sessionFactory;
  }

  @Bean
  public DataSource dataSource() {
    final DriverManagerDataSource dataSource = new DriverManagerDataSource();

    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
    dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
    dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
    dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));

    return dataSource;
  }

  @Bean
  @Autowired
  public DataSourceTransactionManager transactionManager() {
     return  new DataSourceTransactionManager(dataSource());
  }
}
