package com.greenfox.lukasrehor.exercise.models;

public class RequestNumber {

    Integer until;

    public RequestNumber (){
    }

    public RequestNumber (Integer until){
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
