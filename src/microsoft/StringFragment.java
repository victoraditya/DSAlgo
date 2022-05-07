package microsoft;

import java.util.HashMap;
import java.util.Map;

public class StringFragment {

    public static void main(String[] args) {
        String a = "dBacaAA";
        String b = "caBdaaA";

        int result = stringFragment(a, b);
        System.out.println(result);
    }

    public static int stringFragment(String a, String b) {
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
            bMap.put(b.charAt(i), bMap.getOrDefault(b.charAt(i), 0) + 1);

            Map<Character, Integer> tempAMap = new HashMap<>(aMap);
            Map<Character, Integer> tempBMap = new HashMap<>(bMap);

            for (int j = 0; j <= i; j++) {

                if (tempAMap.equals(tempBMap)) count++;
                if(tempAMap.get(a.charAt(j))!=null && tempAMap.get(a.charAt(j))-1==0) tempAMap.remove(a.charAt(j));
                if(tempBMap.get(b.charAt(j))!=null && tempBMap.get(b.charAt(j))-1==0) tempBMap.remove(b.charAt(j));

                if(tempAMap.get(a.charAt(j))!=null)
                tempAMap.put(a.charAt(j),tempAMap.get(a.charAt(j))-1);
                if(tempBMap.get(b.charAt(j))!=null)
                tempBMap.put(b.charAt(j),tempBMap.get(b.charAt(j))-1);
            }


        }

        return count;

    }

}
