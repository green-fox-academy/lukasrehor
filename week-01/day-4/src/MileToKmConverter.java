import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance in km:");
        double x = scan.nextInt();
        System.out.println("That is " + (x / 1.609344) + " miles.");
    }
}