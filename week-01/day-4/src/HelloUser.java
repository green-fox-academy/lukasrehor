import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello user! Pls give me your name!");
        String username = myScanner.nextLine();
        System.out.println("Hello " + username + "!");
    }
}