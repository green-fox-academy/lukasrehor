import java.util.*;
import java.util.stream.Collectors;

public class Hands {

    Card c1;
    Card c2;
    Card c3;
    Card c4;
    Card c5;

    List<Card> hand;

    public Hands(List<Card> hand) {
        this.hand = hand;
    }

    public Hands(Card c1, Card c2, Card c3, Card c4, Card c5) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;

    }

    public static Boolean isRoyalFlush(Card c1, Card c2, Card c3, Card c4, Card c5) {
        List<Card> cards = Arrays.asList(c1, c2, c3, c4, c5);
        //Collections.sort(cards);
        cards = cards.stream()
                .sorted(Comparator.comparingInt(Card::getId))
                .collect(Collectors.toList());

        if ((cards.get(0).id == 9 && cards.get(1).id == 10 && cards.get(2).id == 11 && cards.get(3).id == 12 && cards.get(4).id == 13)
                && isFlush(c1, c2, c3, c4, c5))
            return true;
        else return false;
    }

    public static Boolean isStraight(Card c1, Card c2, Card c3, Card c4, Card c5) {
        List<Card> cards = Arrays.asList(c1, c2, c3, c4, c5);
        cards=cards.stream()
                .sorted(Comparator.comparingInt(Card::getId))
                .collect(Collectors.toList());
        if (cards.get(0).id == (cards.get(1).id -1) && cards.get(1).id == (cards.get(2).id -1)
                && cards.get(2).id == (cards.get(3).id - 1) && cards.get(3).id == (cards.get(4).id - 1)) return true;
        else return false;
    }

    public static Boolean isFlush(Card c1, Card c2, Card c3, Card c4, Card c5) {
        if (c1.color == c2.color && c2.color == c3.color && c3.color == c4.color && c4.color == c5.color) return true;
        else return false;
    }

}