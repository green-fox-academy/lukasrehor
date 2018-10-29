// Create a Fox class with 3 properties(name, type, color)
// Fill a list with at least 5 foxes, it's up to you how you
// name/create them! Write a Stream Expression to find the foxes - huh? Find? How? Non-clear instructions :-/
// with green color! Write a Stream Expression to find the foxes
// with green color and pallida type!

import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    String type;
    String color;

    Fox (String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }
    public static void main(String[] args) {
        List<Fox> foxList = new ArrayList<>();
        foxList.add(new Fox("Mr.Fox", "fastfox","orange"));
        foxList.add(new Fox("Mrs.Fox","dangerous", "green"));
        foxList.add(new Fox("Foxl","pallida","green"));
        foxList.add(new Fox("Fixl","pallida","green"));
        foxList.add(new Fox("Fuksl","pallida","grey"));

        foxList.stream().filter(fox -> fox.color.equals("green")).forEach(fox -> System.out.println(fox.name + " is green"));
        foxList.stream().filter(fox -> fox.type.equals("pallida") && fox.color.equals("green")).forEach(fox -> System.out.println(fox.name + " is of pallida type and green color"));
    }
}