import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int squareline = scan.nextInt();
        for (int i = 0; i <= squareline; i++) {
            for (int b = 0; b <= squareline; b++) {
                if (i == 0 || b == 0 || i == squareline || b == squareline || i == b) {
                    System.out.print("%");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}