public class Main {
/*
Sample output: 1 1
 2 3 5 8 13 21 34 55 89 144 233 377 610 9870
 */
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a + " " + b);
        System.out.print(sum(a, b));
    }

    public static int sum(int left, int right) {
        int theSum = left + right;
        if (theSum > 1000) { // End the Fibonnaci series at 1000.
            return 0;
        } else {
            System.out.print(" " + theSum);
            return sum(right, theSum);
        }
    }
}