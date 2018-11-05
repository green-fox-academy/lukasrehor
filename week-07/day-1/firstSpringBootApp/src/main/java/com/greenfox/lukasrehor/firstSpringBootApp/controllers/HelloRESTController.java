package com.greenfox.lukasrehor.firstSpringBootApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong id = new AtomicLong();

    @GetMapping(value = "/greeting")
    public Greeting hellooo () {
        return new Greeting(1, "Hello World!");     // krasne zkraceno
    }

    @GetMapping(value = "/greeting2")   // http://localhost:8080/greeting2?name=Lukas
    public Greeting helloMyName (@RequestParam(value = "name", defaultValue = "World!") String content) {
        Greeting myGreeting = new Greeting(1, "Hello " + content);
        return myGreeting;
    }

    @GetMapping(value = "/greeting3")   // http://localhost:8080/greeting3?name=Lukas vyhazuje id+1 pri kazdem opakovanem zadani adresy
    public Greeting helloMyNameAndIncrementId (@RequestParam(value = "name", defaultValue = "World!") String content) {
        Greeting myGreeting = new Greeting(id.getAndIncrement(), "Hello " + content);
        return myGreeting;
    }
}