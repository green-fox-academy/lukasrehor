package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.repository.Inface1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    Inface1 todoRepository;

    @Autowired
    public TodoController (Inface1 todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list (@RequestParam(value = "isActive", required = false) String completed, Model model) {
        if (completed != null && completed.equals("true")) {
            model.addAttribute("todolist",todoRepository.findAll().stream().filter(x -> true == (x.isDone())).collect(Collectors.toList()));
            return "todolist";
        } else  if (completed != null && completed.equals("false")) {
            model.addAttribute("todolist",todoRepository.findAll().stream().filter(x -> false == (x.isDone())).collect(Collectors.toList()));
            return "todolist";
        } else {
            model.addAttribute("todolist",todoRepository.findAll());
            return "todolist";
        }
    }

    @GetMapping(value = "/addtodo")
    public String openAddpage() {
        return "addtodo";
    }

    @PostMapping("/addtodo")
    public String addTodo (@RequestParam(value = "todo") String s) {
        todoRepository.save(new Todo(s,false));
        return "redirect:/todo/";
    }

    @GetMapping(value = "/delete")
    public String delTodo (@RequestParam(value = "id") Long x){
        todoRepository.deleteById(x);
        return "redirect:/todo/";
    }

    @GetMapping(value = "/{id}/edit")
    public String editTodo (@PathVariable(value = "id") Long x, Model model){
        model.addAttribute("todo", todoRepository.findById(x).get());
        return "edit";
    }

    @PostMapping(value = "/{id}/edit")
    public String editTodo2 (@PathVariable(value = "id") Long x,@RequestParam(value = "description") String description, @RequestParam(value = "urgent", required = false, defaultValue = "false") boolean urgent,
                             @RequestParam(value = "done", required = false, defaultValue = "false") boolean done) {
        Todo t = todoRepository.findById(x).get();
        t.setTitle(description);
        t.setUrgent(urgent);
        t.setDone(done);
        todoRepository.save(t);
        return "redirect:/todo/";
    }
}