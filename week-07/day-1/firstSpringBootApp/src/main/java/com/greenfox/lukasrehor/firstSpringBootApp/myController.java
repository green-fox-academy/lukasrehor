package com.greenfox.lukasrehor.firstSpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello () {
        return "<h1>TEEEEEST</h1>";  // localhost:8080/hello spusti TEEEEST. pouze localhost:8080 bez value pusti index
    }
}