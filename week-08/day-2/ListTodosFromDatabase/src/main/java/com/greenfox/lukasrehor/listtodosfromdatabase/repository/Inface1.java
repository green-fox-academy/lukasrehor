package com.greenfox.lukasrehor.listtodosfromdatabase.repository;

import com.greenfox.lukasrehor.listtodosfromdatabase.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface Inface1 extends CrudRepository<Todo, Long> {
}