package com.greenfox.lukasrehor.exercise.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AppendA {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    String appended;

    public AppendA (String word) {
        appended = word+"a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
