package com.greenfox.lukasrehor.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 1)   Implement the CommandLineRunner interface on your application
        Autowire the Printer to your application
        Use the log method
        The output should be similar to the following:
        SOME SPRING INFO
        2018-01-09T16:17:25.323 MY PRINTER SAYS --- hello
        SOME SPRING INFO
   2)   Any kind of color class (for i.e. RedColor) can implement this interface overriding printColor(); sout-ing for i.e. "It is red in color...".
        Implement the interface multiple times for different colors
        Annotate one of them with @Service and autowire the interface in the application and use the printColor method
        Move the annotation to another implementation
        Change the implementations to use the Printer service with autowiring (instead of sout-ing)
        */


@SpringBootApplication
public class Main implements CommandLineRunner {

    Printer logger;
    myColorInterface color;

    @Autowired
    public Main(Printer logger, myColorInterface color) {
        this.logger = logger;
        this.color = color;
    }

    @Override
    public void run (String...args) {
        logger.log("blablabla");
        logger.log(color.printColor());
        System.out.println(color.printColor());
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}