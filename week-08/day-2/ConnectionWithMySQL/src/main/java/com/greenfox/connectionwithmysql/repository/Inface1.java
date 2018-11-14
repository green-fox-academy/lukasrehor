package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Inface1 extends CrudRepository<Todo, Long> {
    @Override
    List<Todo> findAll();
}