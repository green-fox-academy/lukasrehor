import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int x = scan.nextInt();
        System.out.println("Enter 2nd number:");
        int y = scan.nextInt();
        if (x > y) {
            System.out.println(x + " is bigger.");
        } else if (x == y) {
            System.out.println("The numbers are even, no fun!");
        } else {
            System.out.println(y + " is bigger.");
        }
    }
}