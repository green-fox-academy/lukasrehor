import java.util.Scanner;

public class Factorial {
    // - Create a function called `factorio`
    //   that returns it's input's factorial
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
    int n = scan.nextInt();
    if (n < 0) {
        System.out.println("Number must be positive");
    } else {
        System.out.println("Factorial of " + n + " is " + factorio(n));
    }
    }
    public static int factorio(int cislo) {
        int fact = 1;
        for (int i = 1; i <= cislo; i++) {
            fact *= i;
        }
        return fact;
    }
}