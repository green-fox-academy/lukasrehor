package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.repository.Inface1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    Inface1 todoRepository;

    @Autowired
    public Main (Inface1 todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //todoRepository.save(new Todo("OMG", false));          //prida pri startu serveru do databaze
        //todoRepository.save(new Todo("Jesus..",false));
        //todoRepository.save(new Todo("For fox's sake", false));
    }
}