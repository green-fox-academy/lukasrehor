import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scan.nextInt();
        System.out.println("Enter b:");
        int b = scan.nextInt();
        System.out.println("Enter c:");
        int c = scan.nextInt();
        System.out.println("Enter d:");
        int d = scan.nextInt();
        System.out.println("Enter e:");
        int e = scan.nextInt();
        System.out.println("Sum: " + (a+b+c+d+e) + ", Average: " + ((a+b+c+d+e)/5.));
    }
}
