package com.tngtech.jgiven.integration.spring.junit5.test;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public String computeSomething() {
        return "result";
    }

    public String sayHello(String message) {
        return "Hello " + message;
    }
}
