package com.greenfox.lukasrehor.exercise.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Greeter {

    @JsonInclude(JsonInclude.Include.NON_NULL)  // bez tohoto bude vypisovat i empty pole, takze napr. {"welcome message":"kecy","error":}
    String welcome_message;
    @JsonInclude(JsonInclude.Include.NON_NULL)  // = zahrne jen kdyz bude mit hodnotu
    String error;

    public Greeter(String name, String title){
        if ((name == null)||(name.equals("")) ) {
            error = "Please provide a name!";
        } else if ((title == null)||(title.equals(""))) {
            error = "Please provide a title!";
        } else {
            welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
    }
        // musi mit gettery a settery jinak error!!!

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}