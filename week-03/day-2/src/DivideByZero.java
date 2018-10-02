// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scan.nextInt();
        try {
            int y = 10 / x;
            System.out.println("10 / the number = "+y);
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by 0!");
        }
    }
}