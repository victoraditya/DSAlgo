package LC;

public class MinSizeSubArray209 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 2, 4, 3};
        int key = 7;
        System.out.println(minSizeSubarray(arr, key));
    }

    private static int minSizeSubarray(int[] arr, int key) {

        int startWindow = -1;
        int endWindow = 0;

        int minIndexCount = Integer.MAX_VALUE;
        if (arr.length == 0) return 0;
        int currentSum = 0;
        while (endWindow < arr.length) {


            currentSum += arr[endWindow];


            while (currentSum >= key) {
                minIndexCount = Math.min(minIndexCount, endWindow - startWindow);
                startWindow++;
                currentSum -= arr[startWindow];
            }

            endWindow++;


        }
        return minIndexCount == Integer.MAX_VALUE ? 0 : minIndexCount;


    }
}


/* for(int i=startWindow;i<=endWindow;i++){
         currentSum+=arr[i];
         }

         if(currentSum<key) {
        endWindow++;
        }
        else {
        minIndexCount = Math.min(minIndexCount,(endWindow-startWindow+1));
        // System.out.println("startwindow"+startWindow+"endwindow"+endWindow);
        startWindow++;
        }*/
