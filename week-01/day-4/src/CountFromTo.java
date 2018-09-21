import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number A:");
        int a = scan.nextInt();
        System.out.println("Enter number B:");
        int b = scan.nextInt();
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        if (b <= a) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        }
        // If it is bigger it should count from the first number to the second by one
        // example:
        // first number: 3, second number: 6, should print:
        // 3
        // 4
        // 5
    }
}
