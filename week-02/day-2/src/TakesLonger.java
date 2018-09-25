public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        StringBuilder builder = new StringBuilder();
        builder.append(quote.substring(0, 21));
        builder.append("always takes longer than");
        builder.append(quote.substring(20, quote.length()));
        quote = builder.toString();
        /* or
        quote = quote.substring(0,21) + "always takes longer than " + quote.substring(21,quote.length());*/
        System.out.println(quote);
    }
}