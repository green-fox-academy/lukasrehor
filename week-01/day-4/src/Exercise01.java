import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        int number = 5; //example, not used anywhere//
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello user! Pls give me your name!");
        String username = myScanner.nextLine();
        System.out.println("Hurray!!");
        System.out.println("Hello, " + username + "!");
        //loop example below//
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop");
        }
        System.out.println("End of loop");

    }
}
