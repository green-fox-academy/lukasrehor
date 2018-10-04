// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

import java.util.ArrayList;

public class String1 {
    public static void main(String[] args) {
        String word = "xbsfxxxxxhrgxy";
        System.out.println(changer(word));
    }
    public static String changer(String theWord) {
        if (theWord.length() == 0) return theWord;
        else if (theWord.charAt(0) == 'x')
            return ('y' + changer(theWord.substring(1)));
            else return theWord.charAt(0) + changer(theWord.substring(1));
    }
}