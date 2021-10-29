package com.tonyarteaga.rest.webservices.restfulrestservices;

import com.tonyarteaga.rest.webservices.restfulrestservices.helloworld.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.tonyarteaga.rest.webservices.restfulrestservices.user.UserResource.class",
		"com.tonyarteaga.rest.webservices.restfulrestservices.exception.CustomizedResponseEntityExceptionHandler"})
public class RestfulRestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulRestServicesApplication.class, args);
	}

}
