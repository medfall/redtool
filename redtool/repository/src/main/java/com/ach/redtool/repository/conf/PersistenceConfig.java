package com.ach.redtool.repository.conf;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages ="com.ach.redtool.repository.*")
@EntityScan("com.ach.redtool.repository.domain.*")
@EnableJpaRepositories(basePackages="com.ach.redtool.repository.*")
@PropertySource("classpath:persistence.properties")

public class PersistenceConfig {
	
	 @Value("${spring.datasource.jndi-name}")
	 private String jndiName;
	 
	 @Bean(destroyMethod = "")
	 public DataSource getDataSoure() {
	 JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
	 return dataSourceLookup.getDataSource(jndiName);
	 }
	 
}
