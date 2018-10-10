/*Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagrams or not.
Create a test for that.*/

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    String aWord = "Clint Eastwood";
    String bWord = "Old West Action";
    aWord = aWord.toLowerCase();
    aWord = aWord.replaceAll("\\s+","");
    bWord = bWord.toLowerCase();
    bWord = bWord.replaceAll("\\s+","");
    System.out.println(anagram(aWord,bWord));
    }
    public static boolean anagram (String aWord, String bWord) {
        char[] tempArrayA = aWord.toCharArray();
        char[] tempArrayB = bWord.toCharArray();
        Arrays.sort(tempArrayA);
        Arrays.sort(tempArrayB);
        return (Arrays.equals(tempArrayA,tempArrayB));
    }
}