import org.junit.Test;
import static org.junit.Assert.*;

public class testAnagram {

    String true1 = "bago";
    String true2 = "goba";
    String nonAnagram = "kfmb";

    @Test
    public void testTrue() {
        assertTrue(Anagram.anagram(true1,true1));
    }
    @Test
    public void testFalse() {
        assertFalse(Anagram.anagram(true1,nonAnagram));
    }
}