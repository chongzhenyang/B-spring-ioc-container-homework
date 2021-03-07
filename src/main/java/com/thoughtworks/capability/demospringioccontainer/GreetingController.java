package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    //private final GreetingService greetingService;
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    public GreetingController() {
        System.out.println("controller constructor");
    }

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = (GreetingService) applicationContext.getBean("greetingService");
        return greetingService.sayHi();
    }

}
