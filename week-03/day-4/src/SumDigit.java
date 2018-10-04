// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {
    public static void main(String[] args) {
        int n = 123456789; // => 1+2+3+4+5+6+7+8+9 = 45
        System.out.println(sum(n));
    }
    public static int sum (int n) {
        if (n == 0) return n;
        else return (sum(n/10) + (n%10));


    //int sum = (n %10) + ((n /10)%10) + ((((n /10)%10)/10)%10) + atd...
    }
}