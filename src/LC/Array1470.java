package LC;

import java.util.ArrayList;
import java.util.List;

public class Array1470 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int[] shuffle = shuffle(nums, nums.length);
        System.out.println(shuffle);

    }


    public static int[] shuffle(int[] nums, int n) {

        List<Integer> list = new ArrayList<>();

        int[] array = new int[n];
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {

            list.add(nums[i]);
            list.add(nums[i + mid]);
        }

     /*   for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }*/

        for (int i = 0; i < n; i++) {
            array[i] = list.get(i);
            System.out.println(array[i]);
        }

        return array;

    }
}
