// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunnies2 {
    public static void main(String[] args) {
        int bunnies = 99;
        int twoEars = 2;
        int threeEars = 3;
        System.out.println(bunnyEars(bunnies, twoEars, threeEars));
    }
    public static int bunnyEars (int bunnz, int twoEars, int threeEars) {
        if (bunnz == 1) return twoEars;
        else if (bunnz %2 == 0) return (threeEars + bunnyEars(bunnz-1,twoEars,threeEars));
        else return (twoEars + bunnyEars(bunnz-1,twoEars,threeEars));
    }
}