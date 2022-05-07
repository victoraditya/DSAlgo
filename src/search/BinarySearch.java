package search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int x = 4;

        System.out.println(binarySearch(array, 0, array.length - 1, x));

    }

    public static int binarySearch(int[] array, int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - 1) / 2;
            if (array[mid] == x) {
                return mid;
            }

            if (x < array[mid]) {
                return binarySearch(array, l, mid - 1, x);
            }

            return binarySearch(array, mid + 1, r, x);
        }

        return -1;
    }
}
