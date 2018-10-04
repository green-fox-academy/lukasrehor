import java.util.Scanner;

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        System.out.println(adder(n));
    }
    public static int adder (int n) {
        if (n == 1) return n;
        else return adder(n - 1) + n;
        }

    /* NEBO:
        public static int adder(int n) {
    int number = 0;
    if (n > 0) {
      number += adder(n - 1) + n;
      }
    return number;
    }
    */
}