package com.greenfox.lukasrehor.foxclub;
import java.util.ArrayList;
import java.util.List;

public class Fox {

    String name;
    List<String> listoftricks;
    String food;
    String drink;

    public Fox () {
    }

    public Fox (String name) {
        this.name = name;
        listoftricks = new ArrayList<>();
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.listoftricks = new ArrayList<>();
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public List<String> getListoftricks() {
        return listoftricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }
}
