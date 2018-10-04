// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {
    public static void main(String[] args) {
        String word = "xbsfxxxxxhrgxy";
        System.out.println(changer(word));
    }
    public static String changer(String theWord) {
        if (theWord.length() == 0) return theWord;
        else if (theWord.charAt(0) == 'x')
            return changer(theWord.substring(1));
        else return theWord.charAt(0) + changer(theWord.substring(1));
    }
}