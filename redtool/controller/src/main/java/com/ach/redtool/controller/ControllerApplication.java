package com.ach.redtool.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan({"com.ach.redtool.controller.*","com.ach.redtool.service.*","com.ach.redtool.repository.*"})
public class ControllerApplication extends SpringBootServletInitializer  {

	  public static void main(String[] args) {
	        SpringApplication.run(ControllerApplication.class, args);
	    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(ControllerApplication.class);
	    }

}
