package com.tonyarteaga.rest.webservices.restfulrestservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloWorldController.class)
public class RestfulRestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulRestServicesApplication.class, args);
	}

}
