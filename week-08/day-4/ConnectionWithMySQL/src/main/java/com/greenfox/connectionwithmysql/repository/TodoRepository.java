package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    @Override
    List<Todo> findAll();
    List<Todo> findByDoneIsTrueOrderByIdDesc();
    List<Todo> findByDoneIsFalseOrderByIdDesc();
    List<Todo> findByTitleIsContainingOrderByIdDesc (String title);
    //List<Todo> findAllByUserAndDoneIsFalse(User user);
}