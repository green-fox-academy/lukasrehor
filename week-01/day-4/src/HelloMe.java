import java.util.Scanner;

public class HelloMe {
    public static void main(String[] args) {
        // Modify this program to greet you instead of the World!
        // LOL, didn't notice it was just about retyping the word World to Lukas :)
        Scanner THESCANNER = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String THENAME = THESCANNER.nextLine();
        System.out.println("Hello " + THENAME + "!");
    }
}
