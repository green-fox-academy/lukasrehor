import org.junit.Test;
import static org.junit.Assert.*;

public class testAnagram {

    @Test
    public void testTrueForAnagrams() {
        String true1 = "bago";
        String true2 = "goba";

        assertTrue(Anagram.anagram(true1,true2));
    }
    @Test
    public void testFalseForNonAnagrams() {
        String true1 = "bago";
        String nonAnagram = "kfminb";
        assertFalse(Anagram.anagram(true1,nonAnagram));
    }
    @Test
    public void testTrueForAnagramsWithDifferentSpacingAndCapitals() {
        String true1 = "bAGo";
        String withSpaces = "ba g o";
        assertTrue(Anagram.anagram(true1,withSpaces));
    }
    @Test
    public void testTrueForAnagramsWithOtherSymbols() {
        String true1 = "bago";
        String withDash = "g-ob-a*&";
        assertTrue(Anagram.anagram(true1,withDash));
    }
}