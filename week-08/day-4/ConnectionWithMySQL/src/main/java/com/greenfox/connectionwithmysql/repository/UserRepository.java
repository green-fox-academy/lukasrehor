package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository <User, Long> {

    @Override
    List<User> findAll();
}