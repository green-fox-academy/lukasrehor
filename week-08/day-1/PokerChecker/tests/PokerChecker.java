import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PokerChecker {
    @Test
    public void doesCompareTwoCards() {
        assertEquals(true, Main.compareTwoCards(13, 11));
    }
    @Test
    public void doesCompareTwoEqualCards() {
        assertEquals(true, Main.compareTwoCards(13, 13));
    }
    @Test
    public void doesCompareTwoCardsWhereTheSecondIsBigger() {
        assertEquals(false, Main.compareTwoCards(13, 14));
    }
    @Test
    public void doesDistinguishEqualValueCardsFromDifferentCards() {
        assertEquals(true, Main.areEqual(13, 13));
    }
    @Test
    public void doesDistinguishEqualValueCardsFromDifferentCards2() {
        assertEquals(false, Main.areEqual(13, 11));
    }
    @Test
    public void doesCompareCardPairs() {
        assertEquals(false, Main.arePairsEqualValue(13, 4, 11, 12));
    }
    @Test
    public void doesCompareCardPairs2() {
        assertEquals(false, Main.arePairsEqualValue(12, 11, 11, 13));
    }
    @Test
    public void doesCompareCardPairs3() {
        assertEquals(true, Main.arePairsEqualValue(12, 11, 11, 12));
    }
    @Test
    public void doesCompareHands() {
        assertEquals(true, Main.areHandsEqual(13, 13, 12, 12, 11, 13, 13, 12, 12, 11));
    }
    @Test
    public void doesCompareHands2() {
        assertEquals(true, Main.areHandsEqual(13, 13, 12, 12, 11, 12, 12, 11, 13, 13));
    }
    @Test
    public void doesCompareHands3() {
        assertEquals(false, Main.areHandsEqual(13, 13, 12, 12, 11, 12, 12, 11, 9, 13));
    }
    @Test
    public void doesCompareHands4() {
        assertEquals(true, Main.areHandsEqual(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
    }
    @Test
    public void doesCompareHands5() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 11);
        Card c3 = new Card(2, 11);
        Card c4 = new Card(2, 11);
        Card c5 = new Card(2, 11);
        assertEquals(true, Main.areColorsInHandEqual(c1, c2, c3, c4, c5));
    }
    @Test
    public void doesCompareHands6() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 11);
        Card c3 = new Card(3, 11);
        Card c4 = new Card(2, 11);
        Card c5 = new Card(2, 11);
        assertEquals(false, Main.areColorsInHandEqual(c1,c2,c3,c4,c5));
    }
    @Test
    public void doesCompareTwoHands1() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 10);
        Card c3 = new Card(2, 8);
        Card c4 = new Card(2, 9);
        Card c5 = new Card(2, 7);
        Card p1 = new Card(3, 2);
        Card p2 = new Card(3, 3);
        Card p3 = new Card(3, 4);
        Card p4 = new Card(3, 5);
        Card p5 = new Card(3, 6);
        assertEquals(true, Main.areColorsinHandsEqualOO(c1,c2,c3,c4,c5,p1,p2,p3,p4,p5));
    }
    @Test
    public void doesCompareTwoHands2() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 10);
        Card c3 = new Card(2, 8);
        Card c4 = new Card(2, 9);
        Card c5 = new Card(3, 7);
        Card p1 = new Card(3, 2);
        Card p2 = new Card(3, 3);
        Card p3 = new Card(3, 4);
        Card p4 = new Card(3, 5);
        Card p5 = new Card(3, 6);
        assertEquals(false, Main.areColorsinHandsEqualOO(c1,c2,c3,c4,c5,p1,p2,p3,p4,p5));
    }
    @Test
    public void isRoyalFlush1() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 10);
        Card c3 = new Card(2, 13);
        Card c4 = new Card(2, 9);
        Card c5 = new Card(2, 12);
        assertEquals(true, Hands.isRoyalFlush(c1,c2,c3,c4,c5));
    }
    @Test
    public void isFlush1() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 10);
        Card c3 = new Card(2, 13);
        Card c4 = new Card(2, 9);
        Card c5 = new Card(2, 12);
        assertEquals(true, Hands.isFlush(c1,c2,c3,c4,c5));
    }
    @Test
    public void isStraight1() {
        Card c1 = new Card(2, 11);
        Card c2 = new Card(2, 10);
        Card c3 = new Card(2, 13);
        Card c4 = new Card(2, 9);
        Card c5 = new Card(2, 12);
        assertEquals(true, Hands.isStraight(c1,c2,c3,c4,c5));
    }
}
