package com.tonyarteaga.rest.webservices.restfulrestservices.helloworld;

import org.springframework.web.bind.annotation.*;

// Controller
@RestController
public class HelloWorldController {

    // GET
    // URI /hello-world
    //method - "Hello World"

    @GetMapping(path = "/hello-world")
    public String helloWorld(){

        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
