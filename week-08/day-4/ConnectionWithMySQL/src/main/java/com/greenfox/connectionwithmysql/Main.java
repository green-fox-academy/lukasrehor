package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public Main (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        //TodoRepository.save(new Todo("OMG", false));          //prida pri startu serveru do databaze
        //TodoRepository.save(new Todo("Jesus..",false));
        //TodoRepository.save(new Todo("For fox's sake", false));
    }
}