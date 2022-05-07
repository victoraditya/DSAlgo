package LC;

public class MaxSubarray53 {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, -3, 4, -1, -2, 1, 5, -3}; //{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(nums));
    }

    public static int maxSubArraySum(int[] nums) {

        int maxSum = 0, maxSumTillHere = 0;

        for (int i = 0; i < nums.length; i++) {
            maxSumTillHere += nums[i];
            if (maxSumTillHere < 0) {
                maxSumTillHere = 0;
            }

            if (maxSumTillHere > maxSum) {
                maxSum = maxSumTillHere;
            }
        }

        return maxSum;

    }













    /*private static void maxSubArraySum(int[] nums) {

        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;

            }
        }
        System.out.println(maxSum);

    }*/

}
