package com.ach.redtool.controller.conf.mvc;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.ach.redtool.repository.*")
@EntityScan("com.ach.redtool.repository.domain.*")
@PropertySource("classpath:application.properties")
public class HibernateConfig {
	
}
