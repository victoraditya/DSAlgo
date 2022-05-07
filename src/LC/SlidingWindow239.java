package LC;/*
package LC;

public class SlidingWindow239 {

    public static void main(String[] args) {
        int []nums = new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20};//{1,3,-1,-3,5,3,6,7};
        int k = 4;

       // System.out.println(findMaxSumOfBruteForce(nums,k));
        System.out.println(findMaxSumOfSlidingWindow(nums,k));
        System.out.println(findIfSumInArray(nums,k));
    }

    private static boolean findIfSumInArray(int[] nums,int k) {




    }

    private static int  findMaxSumOfSlidingWindow(int[] nums, int k) {

        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum+=nums[i];
        }

        for(int i=k;i<nums.length-1;i++){
            int currentSum=maxSum;
            currentSum=currentSum+nums[i]-nums[i-k];
            if(currentSum>maxSum) maxSum=currentSum;
        }
        return maxSum;

    }

    private static int findMaxSumOfBruteForce(int[] nums, int k) {

        int maxSum=0;
        for(int i=0;i<nums.length-k+1;i++){
            int currentSum=0;
            for(int j=0;j<k;j++){
                currentSum+=nums[i+j];

            }
            if(currentSum>maxSum) maxSum=currentSum; //Math.max()
        }
        return maxSum;
    }

}
*/
