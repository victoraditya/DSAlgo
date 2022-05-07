import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class nutanixMinSum {

    public static void main(String[] args) {
        int[] nums = {10, 20, 7};
        // List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int k = 4;
        System.out.println(minSum(nums, k));

    }

    private static int minSum(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(nums.length, Collections.reverseOrder());

        Arrays.stream(nums).boxed().forEach(e -> queue.add(e));

        int sum = 0;
        for (int i = 0; i < k; i++) {

            Double poll = Double.valueOf(queue.poll());

            poll = (Math.ceil(poll / 2));
            System.out.println(poll);
            queue.add(poll.intValue());
        }
        while (!queue.isEmpty()) {
            Integer num = queue.poll();
            sum += num;
        }
        return sum;


    }
}
