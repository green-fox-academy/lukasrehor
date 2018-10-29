// Write a Stream Expression to get the squared values of the positive numbers from the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        // solution1: numbers.stream().filter(x -> x >= 0).map(x -> x * x).forEach(System.out::println);
        // solution2: numbers.stream().filter(x -> x >= 0).forEach(x -> System.out.println(x * x));
        // solution3:
        List<Integer> squared = numbers.stream()
                .filter(x -> x >= 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squared);
    }
}