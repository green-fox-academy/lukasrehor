package com.greenfox.lukasrehor.exercise.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DoUntil {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    Integer result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String error;

    public DoUntil (String action, RequestNumber until){
        if (until == null) {
            error = "Please provide a number!";
        } else if (action.equals("sum")) {
            result = 0;
            for (int i = 0; i <= until.getUntil(); i++) {
                result += i;
            }
        } else if (action.equals("factor")){
            result = 1;
            for (int i = 1; i <= until.getUntil(); i++) {
                result *= i;
            }
        }
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}