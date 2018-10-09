/*Check out what is the Comparable interface
Get your Domino class
Implement the Comparable interface on the Domino
        why? we want to compare based on the result of Domino.compareTo()
        First compare the first value and then the second
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);

// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
        Make your Todo class implement Comparable
        It should compare the completed field first
        Then the description
        Or if you haven't got a separate Todo class, or it doesn't contain fields like description and completed, use your Thing class*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        Collections.sort(dominoes);
        System.out.println(dominoes);
        }
    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
