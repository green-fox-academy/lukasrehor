package com.greenfox.lukasrehor.dependencies;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

/*  Caesar coding is just shifting every character in the text with a specific
    number of amount in the alphabet, coded example with 1 is fybnqmf.
    Endpoints for encoding and decoding with a text and number query param
    Link at the main page for both
    Service method:*/

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }
}