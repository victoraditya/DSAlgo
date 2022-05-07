package LC;

import java.util.HashMap;
import java.util.Map;

public class Map771 {

    Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Map771 map771 = new Map771();
        map771.numJewelsInStones("aA", "ZaAAbbb");
    }

    public int numJewelsInStones(String J, String S) {

        //char[] charsJ = J.toCharArray();
        //char[] charsS = S.toCharArray();


        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {

            if (map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
            } else {
                map.put(S.charAt(i), 1);
            }

        }

        System.out.println(map.entrySet());

       /* int count=0;
        for(int i=0;i<charsJ.length;i++){
            if(map.containsKey(charsJ)) count+=map.get(charsJ);

        }*/

        return 0;

    }
}

