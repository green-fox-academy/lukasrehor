// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int n = 10;
        System.out.println(powerN(base,n)); // 2*2*2*2*2*2*2*2*2*2 = 1024
    }
    public static int powerN (int base, int n) {
        if (n == 1) return base;
        else return (powerN(base, (n-1)) * base);
    }
}