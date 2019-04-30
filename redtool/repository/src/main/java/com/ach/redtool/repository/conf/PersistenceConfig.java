package com.ach.redtool.repository.conf;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages ="com.ach.redtool.repository.*")
@EntityScan("com.ach.redtool.repository.domain.*")
@EnableJpaRepositories(basePackages="com.ach.redtool.repository.*")
@PropertySource("classpath:persistence.properties")
public class PersistenceConfig {
	
}
