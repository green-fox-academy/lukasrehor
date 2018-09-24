import java.util.Scanner;

public class Sum {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        System.out.println(sum(number));
    }
    public static int sum(int num) {
        int sum = 0;
        for (int i = 1; i < num +1; i++) {
            sum += i;
        }
        return sum;
    }
}