package com.greenfox.lukasrehor.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*Endpoint at /useful/email with a queryparam
Have a link at the main page to an example: /useful/email?email=is@this.valid
Create a validateEmail method in the UtilityService
check if the string contains a @ and a .
Display the following to the user:
is@this.valid is a valid email address in green
not_valid_email.com is not a valid email address in red*/

@Controller
public class UsefulUtilities {

    UtilityService utilityService;

    @Autowired
    public UsefulUtilities (UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping(value = "/useful")
    public String returnIndexHTML(){
        return "index";
    }

    @GetMapping(value = "/useful/colored")
    public String coloredBackground (Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping(value = "/useful/email")
    public String emailValidator (@RequestParam(value = "email") String theEmail, Model model) {
        if (utilityService.validateEmail(theEmail)) {
            model.addAttribute("emailChecked",theEmail + " is a valid email address, cool!");
            model.addAttribute("color","green");
        } else {
            model.addAttribute("emailChecked",theEmail + " is not a valid email address!!!");
            model.addAttribute("color","red");
        }
        return "email";
    }

    @GetMapping(value = "/caesar")
    public String caesarFn (@RequestParam(value = "text") String text,@RequestParam(value = "number") String number, Model model) {
        int x = Integer.parseInt(number);
        model.addAttribute("caesared", utilityService.caesar(text,x));
        model.addAttribute("original", text);
        model.addAttribute("number", x);
        return "caesar";
    }
}