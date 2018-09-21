import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        Scanner party = new Scanner(System.in);
        System.out.println("How many girls for party?");
        int girls = party.nextInt();
        System.out.println("How many boys for party?");
        int boys = party.nextInt();
        int total = girls + boys;
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // It should print: Average party...
        // If there are less people coming than 20
        if (girls == 0) {
            System.out.println("Sausage party");
        } else if (total >= 20 && girls == boys) {
            System.out.println("The Party is excellent!");
        } else if (total >= 20 && girls != boys) {
            System.out.println("Quite cool party!");
        } else {
            System.out.println("Average party...");
        }
    }
}
