// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {
        int bunnies = 10;
        System.out.println(bunnyEars(bunnies));
    }
    public static int bunnyEars (int bunnz) {
        int ears = 2;
        if (bunnz == 1) return ears;  //nebo (bunz == 0) return 0;
        else return bunnyEars(bunnz-1) + ears;
    }
}