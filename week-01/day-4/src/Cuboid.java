import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cuboid side x size:");
        double x = scan.nextInt();
        System.out.println("Enter cuboid side y size:");
        double y = scan.nextInt();
        System.out.println("Enter cuboid side z size:");
        double z = scan.nextInt();
        System.out.println("Surface Area: " + (((x*y)+(x*z)+(y*z))*2));
        System.out.println("Volume: " + x * y * z);
    }
}
