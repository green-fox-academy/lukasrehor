package com.greenfox.connectionwithmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    long id;
    String title;
    boolean urgent;
    boolean done;

    public Todo(){      //musi byt i kdyz se tvari nepouzite, jinak to nebude fachat, interface ho potrebuje
    }

    public Todo(String title, boolean done) {
        this.title = title;
        urgent = false;
        this.done = done;
    }

    public String getTitle() {      //musi byt jinak nefacha ${todo.title}
        return title;
    }

    public long getId() {
        return id;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}