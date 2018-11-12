package com.greenfox.lukasrehor.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    List<Fox> foxList;
    Fox MrFox;

    public MainController () {
        foxList = new ArrayList<>();
        MrFox = new Fox ("Mr. Fox", "pizza","lemonade");
        MrFox.listoftricks.add("write HTML");
        MrFox.listoftricks.add("code in Java");
    }

    @GetMapping (value = "/")
    public String index(@RequestParam(value = "name", required = false) String input, Model model){

        if (input != null) {
            for (int i = 0; i < foxList.size(); i++) {
                if (foxList.get(i).name.equals(input)){
                    model.addAttribute("listoftricks",foxList.get(i).listoftricks);
                    model.addAttribute("name", foxList.get(i).name);
                    model.addAttribute("food", "food");
                    model.addAttribute("drink", "drink");
                    if (foxList.get(i).listoftricks.isEmpty()) {
                        model.addAttribute("tricks", " does not know any tricks yet.");
                    } else {
                        model.addAttribute("tricks", "knows " + Integer.toString(foxList.get(i).listoftricks.size()) + " tricks.");
                    }
                    return "index";
                }
            } return "login";
        } else {
            model.addAttribute("listoftricks",MrFox.listoftricks);
            model.addAttribute("name", MrFox.getName());
            model.addAttribute("food", MrFox.getFood());
            model.addAttribute("drink", MrFox.getDrink());
            model.addAttribute("tricks", "knows " + Integer.toString(MrFox.listoftricks.size()) + " tricks.");
            return "index";
        }
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String logged(@RequestParam(value = "name") String input) {
        foxList.add(new Fox(input));
    return "redirect:/?name="+input;
    }
}