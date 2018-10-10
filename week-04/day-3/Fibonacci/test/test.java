import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    int testIndex = 7;
    int shouldBe = 8;

    @Test
    public void testValue(){
        assertEquals(shouldBe,Main.fibonacci(testIndex));
    }
    @Test
    public void testSomethingElse(){
        assertNotEquals("some string",Main.fibonacci(testIndex));
    }
}