// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Refactorio {
    public static void main(String[] args) {
        int x = 5; // 5x4x3x2x1 = 120
        System.out.println(refactorio(x));
    }
    public static int refactorio(int x) {
        if (x == 0) return 1;
        else return (x * refactorio(x-1));
    }
}