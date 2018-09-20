import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of chickens:");
        int x = scan.nextInt();
        System.out.println("Enter number of pigs:");
        int y = scan.nextInt();
        System.out.println("They have got " + ((x*2)+(y*4)) + " legs in total.");
    }
}