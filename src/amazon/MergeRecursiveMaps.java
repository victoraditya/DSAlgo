package amazon;

import designpattern.headfirst.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeRecursiveMaps {
    public static void main(String[] args) {
        Map<String,Object> map1 = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();
        Map<String,Object> submap = new HashMap<>();
        submap.put("home","bob@home");submap.put("work","bob@work");
        Map<String,Object> submap2 = new HashMap<>();
        submap.put("home1","bob@home");submap.put("work1","bob@work");

        map1.put("name","aditya");
        map1.put("company","jpmc");

        map2.put("company",submap);

        /*Map<String,Object> submap = new HashMap<>();
        Map<String,Object> submap2 = new HashMap<>();
        submap.put("home","bob@home");submap.put("work","bob@work");
        submap2.put("home2","bob@home");submap2.put("work","bob@work");
        map2.put("emails",submap2);

        map1.put("name","bob");map1.put("emails",submap);*/

        System.out.println(mergeMap(map1,map2));
    }


    public static Map mergeMap(Map<String,Object> map1,Map<String,Object> map2){

       for(Object key:map2.keySet()){
           //if both map for the given key value is map then call again with the two maps as values
           if(map2.get(key) instanceof Map && map1.get(key) instanceof Map){
               Map map1Child = (Map)map1.get(key);
               Map map2Child = (Map)map1.get(key);
               map2Child.put(key,mergeMap(map1,map2));

               // if value for both maps for that key is of type list then take out the list and merge
           }else if(map2.get(key) instanceof List && map1.get(key) instanceof List) {
               List list1Child = (List)map1.get(key);
               List list2Child = (List)map1.get(key);

               for(Object each : list1Child){
                   if(list2Child.contains(each)){
                       list2Child.add(each);
                   }
               }

               // else string so override the string value for the particular key
           }else{
               map1.put((String) key,map2.get(key));
           }
       }

       return map1;


    }


}
