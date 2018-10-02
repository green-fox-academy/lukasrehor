import java.util.*;

public class AppendLetter{
    public static void main(String... args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        // The output should be: "boa", "anaconda", "koala", "panda", "zebra"
        System.out.println(appendA(far));
    }
    public static List appendA(List withoutA) {
        List<String> withA = new ArrayList<>();
        for (int i = 0; i < withoutA.size(); i++) {
            withA.add(withoutA.get(i) + "a");
        }
        return withA;
    }
}