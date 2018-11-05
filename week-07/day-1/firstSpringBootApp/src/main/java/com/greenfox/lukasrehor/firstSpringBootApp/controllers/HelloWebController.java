package com.greenfox.lukasrehor.firstSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private AtomicLong id = new AtomicLong();

    @RequestMapping("/web/greeting")    // http://localhost:8080/web/greeting  (to spodni cviceni pridava dodatecne nesmyslny null radek)
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }

    @RequestMapping("/web/greeting2")   // http://localhost:8080/web/greeting2?name=Lukas
    public String greeting2(Model model, @RequestParam(value = "name", defaultValue = "World!") String name) {
        model.addAttribute ("name", name);
        model.addAttribute("counter", id.getAndIncrement() + 1 );
        return "greeting";
    }
}