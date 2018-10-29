// Write a Stream Expression to find the frequency of characters in a given string!

import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        String myString = "sli tri a prostredni upadl";

        Map<Character, Long> letterMap = myString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(letterMap);

        /*
        Map<Object, Long> letterMap = myString.chars()
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        letterMap.entrySet().stream()
                .forEach(entry -> System.out.println((char) (int) entry.getKey() + " = " + entry.getValue()));
         */
    }
}