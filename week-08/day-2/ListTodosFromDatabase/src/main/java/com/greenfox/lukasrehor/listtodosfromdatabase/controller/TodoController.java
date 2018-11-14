package com.greenfox.lukasrehor.listtodosfromdatabase.controller;

import com.greenfox.lukasrehor.listtodosfromdatabase.repository.Inface1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    Inface1 todoRepository;

    @Autowired
    public TodoController (Inface1 todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list (Model model) {
        model.addAttribute("todolist",todoRepository.findAll());
        return "todolist";
    }
}