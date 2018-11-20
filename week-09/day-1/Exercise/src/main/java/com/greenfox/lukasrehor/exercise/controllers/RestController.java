package com.greenfox.lukasrehor.exercise.controllers;

import com.greenfox.lukasrehor.exercise.models.AppendA;
import com.greenfox.lukasrehor.exercise.models.DoUntil;
import com.greenfox.lukasrehor.exercise.models.Greeter;
import com.greenfox.lukasrehor.exercise.models.RequestNumber;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //http://localhost:8080/doubling?input=15
    // tahle doubling metoda jede cela ciste tady v controlleru pres hashmapu, nepotrebuje zadny objekt...
    @GetMapping(value = "/doubling")
    public Object doubling (@RequestParam (value = "input", required = false) Integer input){

        if (input == null){
            HashMap<String,String> errorMap = new HashMap<>();
            errorMap.put("error","Please provide an input!");
            return errorMap;
        } else {
            int result;
            result = input * 2;
            HashMap<String, Integer> hashMap1 = new HashMap<>();
            hashMap1.put("received", input);
            hashMap1.put("result", result);
            return hashMap1;
        }
    }

    //http://localhost:8080/greeter?name=Petike&title=student
    @GetMapping(value = "/greeter")
    public Object greeter (@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false)String title){
        Greeter greeter = new Greeter(name, title);
        return greeter;
    }

    //  /appenda/{appendable} => http://localhost:8080/appenda/CocaCol
    @GetMapping (value = "/appenda/{appendable}")
    public Object appendA (@PathVariable(value = "appendable", required = false) String word) {
        AppendA appendA = new AppendA(word);
        return appendA;
    }

    @PostMapping (value = "/dountil/{action}")
    public Object doUntil (@PathVariable(value = "action") String action, @RequestBody(required = false) RequestNumber until) {
        return new DoUntil(action, until);
    }
}