package recursion;

public class RecursionAccumulator {

    public static void main(String[] args) {
        // System.out.println(factorial(4));
        // System.out.println(factorialAccumulator(1,4));
        System.out.println(count(4));
    }

    private static int count(int n) {
        if (n == 0) return 1;

        System.out.println(n);
        count(n - 1);
        return n;
        //return count(n-1);
    }

    private static int factorialAccumulator(int accumulator, int n) {
        if (n == 1) return accumulator;
        return factorialAccumulator(n * accumulator, n - 1);
    }

    private static int factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }


}
