// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
    public static void main(String[] args) {
        String word = "befelemepes seveze"; // = b*e*f*e*l*e....
        System.out.println(changer(word));
    }
    public static String changer (String theWord) {
        if (theWord.length() == 1) return theWord;
        else return theWord.charAt(0) + "*" + changer(theWord.substring(1));
    }
}