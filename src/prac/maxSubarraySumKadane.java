package prac;

public class maxSubarraySumKadane {

    public static void main(String[] args) {
        int[] array = {-2, 10, 7, -5, 15, 6}; //{-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSumSubarray(array));
    }

    private static int maxSumSubarray(int[] array) {
        int currSum = 0;
        int globalSum = 0;

        for (int i = 0; i < array.length; i++) {

            if ((currSum + array[i]) < 0) {
                currSum = 0;
            } else currSum += array[i];

            if (globalSum < currSum) globalSum = currSum;
        }

        return globalSum;
    }
}
