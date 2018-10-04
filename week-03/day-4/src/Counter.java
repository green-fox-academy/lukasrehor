import java.util.Scanner;

// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        countdown(n);
        System.out.println("n! = " + factorialWithRecursion(n));
               /* pomoci loopu
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }*/
    }
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            countdown(n-1);
        }
    }
    //vzor faktorialu n!
    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }
    }
}