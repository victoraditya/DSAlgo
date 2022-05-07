package recursion;

public class GCD {

    public static void main(String[] args) {
        //  gcd(30,20);
        System.out.println(gcdRecursive(30, 20));
    }

    private static int gcdRecursive(int n1, int n2) {

        if (n2 == 0) return n1;

        return gcdRecursive(n2, n1 % n2);

        //System.out.println(n1);

    }

    private static void gcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;

        }
        System.out.println(n1);

    }
}
