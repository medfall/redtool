package com.ach.redtool.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@PropertySource("classpath:application.properties")
@ComponentScan({"com.ach.redtool.controller.*","com.ach.redtool.service.*","com.ach.redtool.repository.*"})
public class ControllerApplication   {

	  public static void main(String[] args) {
	        SpringApplication.run(ControllerApplication.class, args);
	    }
}


