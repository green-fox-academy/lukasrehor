import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scan.nextInt();
        if (x %2 == 0) {
            System.out.println(x + " is even.");
        }
        if (x %2 > 0) {
            System.out.println(x + " is odd.");
        }
    }
}
