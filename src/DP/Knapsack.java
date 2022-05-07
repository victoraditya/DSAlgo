package DP;/*
package DP;

public class Knapsack {

    public static void main(String[] args) {
        int capacity=5;
        int numberOfItems=3;
        int [] weights = new int[] {4,2,3};
        int [] value = new int[] {10,4,7};
        int [][] knapsackTable = {
                {}
        };

        knapsack(capacity,numberOfItems,weights,value,knapsackTable);
    }

    private static int knapsack(int capacity, int numberOfItems, int[] weights, int[] values, int[][] knapsackTable) {

        for(int i=1;i<numberOfItems;i++){
            for(int w=1;w<capacity+1;w++){
                int notTakingItem = knapsackTable[i-1][w];
                int takingItem=0;
                takingItem = values[i] + knapsackTable[i-1][w-weights[i]];

                if(weights[i])
            }
        }
    }

}
*/
