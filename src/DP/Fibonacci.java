package DP;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        int n = 8;
        //   System.out.println(bruteForceFibonacci(n));
        System.out.println(DPFibonacci(n, map));
    }

    private static int DPFibonacci(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) return map.get(n);

        map.put(n - 1, DPFibonacci(n - 1, map));
        map.put(n - 2, DPFibonacci(n - 2, map));

        int calculatedNumber = map.get(n - 1) + map.get(n - 2);
        map.put(n, calculatedNumber);

        return map.get(n);
    }

    private static int bruteForceFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return bruteForceFibonacci(n - 1) + bruteForceFibonacci(n - 2);
    }


}

