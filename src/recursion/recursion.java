package recursion;

public class recursion {

    public static void main(String[] args) {
        int result = recursiveAdd(5);
        System.out.println(result);
    }

    public static int recursiveAdd(int value) {

        if (value == 0) return value;
        return value + recursiveAdd(value - 1);
    }
}
