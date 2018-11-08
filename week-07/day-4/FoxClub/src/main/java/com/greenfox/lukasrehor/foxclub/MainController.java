package com.greenfox.lukasrehor.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    String name = "Mr. Fox";
    String tricksNum = "0";

    @GetMapping (value = "/")
    public String index(@RequestParam(value = "name", required = false) String input, Model model){
        if (input != null) {
            model.addAttribute("name", input);
            model.addAttribute("tricks", tricksNum);
            return "index";
        } else {
            model.addAttribute("name", name);
            model.addAttribute("tricks", tricksNum);
            return "index";
        }
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String logged(@RequestParam(value = "name") String input) {
        name = input;
    return "redirect:/?name="+input;
    }
}