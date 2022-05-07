package LC;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    Map<Integer, Integer> map = new HashMap<>();


    public static void main(String[] args) {

        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        int[] arr = {1, 1, 1};//{10,2,-2,-20,10};//
        int key = 2;

        System.out.println(subarraySumEqualsK.findSubarraySumEqualsK(arr, key));
    }

    private int findSubarraySumEqualsK(int[] arr, int key) {

        int curSum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            curSum += arr[i];

            if (map.containsKey(curSum - key)) {
                map.put(curSum - key, ++count);
            } else {
                map.put(curSum, 1);
            }

        }
        return map.get(curSum - key);

    }
}
