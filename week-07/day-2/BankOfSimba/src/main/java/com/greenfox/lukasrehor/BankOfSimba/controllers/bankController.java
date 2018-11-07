package com.greenfox.lukasrehor.BankOfSimba.controllers;

import com.greenfox.lukasrehor.BankOfSimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class bankController {

    private BankAccount simba = new BankAccount("Simba", 2000, "lion", false, true);

    @GetMapping(value = "/show")
    public String showingOneAccount (Model model) {
        model.addAttribute("name", simba.getName());
        model.addAttribute("balance", simba.getBalance());
        model.addAttribute("animal", simba.getAnimalType());
        model.addAttribute("currency", "Zebra");
        return "index";
    }

    @GetMapping(value = "/tag")
    public String HTMLception (Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "index2";
    }

    @GetMapping(value = "/multiple")
    public String multipleAccounts (Model model) {
        List<BankAccount> myList = new ArrayList<>();
        myList.add(new BankAccount("King",10000,"lion", true, true));
        myList.add(new BankAccount("Queen", 8000,"lion", false, true));
        myList.add(simba);
        myList.add(new BankAccount("Scar",50,"lion",false, false));
        model.addAttribute("list", myList);
        return "index3";
    }
}