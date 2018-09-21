import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        // Example:
        // The number 15 should print:
        // 1 * 15 = 15
        // 2 * 15 = 30
        // etc...
        // 10 * 15 = 150
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter THE NUMBER");
        int x = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int total = i * x;
            System.out.println(i + " * " + x + " = " + total);
        }
    }
}