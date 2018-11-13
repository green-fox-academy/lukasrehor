import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] color = new int[4];

        int[] value = new int[13];


        compareTwoCards(13, 11);


    }

    public static Boolean compareTwoCards(int value1, int value2) {
        if (value1 >= value2) return true;
        else return false;
    }

    public static Boolean areEqual(int value1, int value2) {
        if (value1 == value2) return true;
        else return false;
    }

    public static Boolean arePairsEqualValue(int value1, int value2, int value3, int value4) {
/*        if(((value1 > value3 || value1 > value4) || (value2 > value3 || value2 > value4)) ||
       ((value1 < value3 || value1 < value4) || (value2 < value3 || value2 < value4))) return false;
       else return true;*/
        if (((value1 == value3) && (value2 == value4)) || ((value1 == value4) && (value2 == value3))) return true;
        else return false;
    }

    public static Boolean areHandsEqual(int value1, int value2, int value3, int value4, int value5, int value6, int value7, int value8, int value9, int value10) {
        List<Integer> hand1 = Arrays.asList(value1, value2, value3, value4, value5);
        List<Integer> hand2 = Arrays.asList(value6, value7, value8, value9, value10);
        Collections.sort(hand1);
        Collections.sort(hand2);
        if (hand1.equals(hand2)) return true;
        else return false;
    }

    public static Boolean areColorsInHandEqual(Card c1, Card c2, Card c3, Card c4, Card c5) {
        if (c1.color == c2.color && c2.color == c3.color && c3.color == c4.color && c4.color == c5.color) return true;
        else return false;
    }

    public static Boolean areColorsinHandsEqualOO(Card c1, Card c2, Card c3, Card c4, Card c5,
                                                  Card p1, Card p2, Card p3, Card p4, Card p5) {
        List<Card> hand1 = Arrays.asList(c1, c2, c3, c4, c5);
        List<Card> hand2 = Arrays.asList(p1, p2, p3, p4, p5);
        int x = 0;
        for (int i = 0; i < 3; i++) {
            if ((hand1.get(i).color == hand1.get(i + 1).color) && (hand2.get(i).color == hand2.get(i + 1).color)){
                x++;
            }
        }
        if (x == 5) return true;
        else return false;
    }
}