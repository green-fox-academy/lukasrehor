/*Create a sum method in your class which has an ArrayList of Integers as parameter
        It should return the sum of the elements in the list
      Follow these steps:
        Add a new test case
        Instantiate your class
        create a list of integers
        use the assertEquals to test the result of the created sum method
      Run them
      Create different tests where you
        test your method with an empyt list
        with a list with one element in it
        with a null*/

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class sumTest {

    Sum myObject = new Sum();
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    @Test
    public void testSum () {
        assertEquals(15,myObject.sumElemets(testList));
    }

    @Test
    public void testEmptyList (){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList());
        assertEquals(0,myObject.sumElemets(myList));
    }

    @Test
    public void testOneElement () {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5));
        assertEquals(5, myObject.sumElemets(myList));
    }
    @Test
    public void testWithNull () {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(0));
        assertEquals(0, myObject.sumElemets(myList));
    }
}