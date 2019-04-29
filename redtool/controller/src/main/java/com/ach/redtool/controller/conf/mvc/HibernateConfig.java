package com.ach.redtool.controller.conf.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "com.ach.redtool.repository.*" })
@PropertySource("classpath:application.properties")
public class HibernateConfig {
	
}
