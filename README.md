# Fibonnaci
 Self-taught solution for the Fibonnaci series.

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a + " " + b);
        System.out.print(sum(a, b));
    }

    public static int sum(int left, int right) {
        int theSum = left + right;
        if (theSum > 1000) {
            return 0;
        } else {
            System.out.print(" " + theSum);
            return sum(right, theSum);
        }
    }
}
