// The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.
// 0,1, (n-2=0)+(n-1=1), (n-2=1)+(n-1=1), (n-2=1)+(n-1=2), (n-2=2)+(n-1=3), (n-2=3)+(n-1=5) ...

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci (int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }
}