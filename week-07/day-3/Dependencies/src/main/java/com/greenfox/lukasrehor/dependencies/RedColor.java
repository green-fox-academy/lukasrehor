package com.greenfox.lukasrehor.dependencies;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements myColorInterface {

    @Override
    public String printColor () {
        return "It is red. WOW!!!";
    }
}