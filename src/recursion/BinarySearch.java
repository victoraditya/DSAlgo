package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int key = 9;
        binarySearch(arr, key);
    }

    private static void binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(start, end, arr, key));
    }

    private static int binarySearch(int start, int end, int[] arr, int key) {

        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (key == arr[mid]) return mid;

        if (key < mid) {
            return binarySearch(start, mid - 1, arr, key);
        } else {
            return binarySearch(mid + 1, end, arr, key);
        }

    }

}
