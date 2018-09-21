import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        // *
        // **
        // ***
        // ****
        // The triangle should have as many lines as the number was
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        String star = "*";
        for (int i = 1; i <= x; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}