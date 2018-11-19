package com.greenfox.connectionwithmysql.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue
    long id;
    String name;
    String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_Id")
    List<Todo> todoList;

    User(String name, List<Todo> todoList) {
        this.name = name;
        this.todoList = todoList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
