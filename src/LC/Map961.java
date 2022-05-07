package LC;

import java.util.HashMap;
import java.util.Map;

public class Map961 {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 3};

        System.out.println(findDefaulter(ints));
    }

    private static int findDefaulter(int[] ints) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            if (map.containsKey(ints[i])) {
                map.put(ints[i], (map.get(ints[i]) + 1));
            } else {
                map.put(ints[i], 1);
            }
        }

        for (int i = 0; i < map.size(); i++) {
            if (map.get(ints[i]) > 1) {
                return ints[i];
            }
        }
        return -1;
    }

}
