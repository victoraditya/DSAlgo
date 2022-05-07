import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String s = "heeeellllllooo";
        System.out.println(check(s));
    }

    public static List check(String s){

        List<List<Integer>> list1 = new ArrayList<>();
        int n = s.length();
        char[] cArray = s.toCharArray();
        int count=0;
        int i=0;
        for(;i<n-1;i++){
            if(cArray[i]==cArray[i+1]){
                count++;
                continue;
            }
            if(count>=2){
                List<Integer> list = new ArrayList<>();
                list.add(i-count);
                list.add(i);
                list1.add(list);
            }
            count=0;
        }

        if(count>=2){
            List<Integer> list2 = new ArrayList<>();
            list2.add(i-count);
            list2.add(i);
            list1.add(list2);
        }

        /*f(count==2) if(cArray[n-2]== cArray[n-1]){
            List<Integer> list2 = new ArrayList<>();
            list2.add(i-count);
            list2.add(i);
            list1.add(list2);
        }*/





        return list1;

    }

}
