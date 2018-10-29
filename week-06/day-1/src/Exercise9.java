// Write a Stream Expression to convert a char array to a string!

import java.lang.reflect.Array;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        char[] myArray = {'h','e','l','l','o'};

        // the most elegant solution:
        // new String(myArray).chars().forEach(c -> System.out.print((char) c));

        String s = new String(myArray).chars()
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
        System.out.println(s);

        // verify:
        String s2 = new String(myArray);
        System.out.println(s2);
    }
}