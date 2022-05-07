package test;

import java.util.*;

public class minSumPrac {

    public static void main(String[] args) {

        // int [] nums = {10,20,7};
        // List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> numList = new ArrayList<>();
        /*numList.add(10);
        numList.add(20);
        numList.add(7);*/
        numList.add(2);
        Integer k = 1;
        System.out.println(minSum(numList, k));

    }

    public static int minSum(List<Integer> numList, Integer k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        numList.stream().forEach(e -> queue.add(e));

        for (int i = 0; i < k; i++) {
            Double num = Double.valueOf(queue.poll());
            Integer numInt = (int) Math.ceil(num / 2);
            queue.add(numInt);
        }

        int minSum = 0;
        while (!queue.isEmpty()) {
            minSum += queue.poll();
        }

        return minSum;


    }

}
