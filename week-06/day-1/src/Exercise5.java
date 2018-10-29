// Write a Stream Expression to find the uppercase characters in a string!

import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        String myWord = "befeLemePesSeveze";
        System.out.println(myWord);

        /*myWord.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .forEach(System.out::println);*/

        String upperChar = myWord.chars()
                .filter(c -> Character.isUpperCase(c))
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining(","));
        System.out.println(upperChar);
    }
}