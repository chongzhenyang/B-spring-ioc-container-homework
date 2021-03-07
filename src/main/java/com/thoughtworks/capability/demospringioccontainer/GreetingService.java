package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GreetingService {

    public GreetingService(){
        System.out.println("service constructor");
    }

    String sayHi() {
        return "hello world";
    }
}
