/*Write a function that computes a member of the fibonacci sequence by a given index
Create tests that covers all types of input (like in the previous workshop exercise)*/

public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci (int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }
}