/*Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagrams or not.
Create a test for that.*/

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String aWord = "Clint Eastwood";
        String bWord = "Old West Action";
        System.out.println(anagram(aWord,bWord));
    }
    public static boolean anagram (String aWord, String bWord) {
        aWord = aWord.toLowerCase();
        //aWord = aWord.replaceAll("\\s+","");  - vykosi mezery
        //aWord = aWord.replaceAll("-", "");    - vykosi pomlcky. Jinak se to da udelat viz dalsi radek - to vymaze vsechno krome zadaneho intervalu
        aWord = aWord.replaceAll("[^a-zA-Z]",""); // - vykosi vse krome a-z a A-Z. napr.[a-zA-Z0-9] kdyz chces nechat i cisla ...
        bWord = bWord.toLowerCase();
        bWord = bWord.replaceAll("[^a-zA-Z]","");
        char[] tempArrayA = aWord.toCharArray();
        char[] tempArrayB = bWord.toCharArray();
        Arrays.sort(tempArrayA);
        Arrays.sort(tempArrayB);
        return (Arrays.equals(tempArrayA,tempArrayB));
    }
}