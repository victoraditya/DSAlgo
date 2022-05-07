package actualtests.booking;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HotelChain {

    Map<Integer, Node> parentMap;
    Map<Integer, List<Integer>> parentToChildMap;
    Map<Integer, Integer> costMap;
    List<Node> visitedList;

    public HotelChain() {
        parentMap = new HashMap<>();
        parentToChildMap = new HashMap<>();
        costMap = new HashMap<>();
        visitedList= new ArrayList<>();
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(3, 0, 11));
        list.add(Arrays.asList(6, -1, 12));
        list.add(Arrays.asList(1, 0, 43));
        list.add(Arrays.asList(5, 3, 10));
        list.add(Arrays.asList(0, -1, 10));
        list.add(Arrays.asList(2, 0, 17));
        list.add(Arrays.asList(4, 3, 11));
        list.add(Arrays.asList(7, 6, 34));

        // create the node structure
        HotelChain hotelChain = new HotelChain();
        //hotelChain.createGraph(list);

        hotelChain.initialize(list);

    }

    private void initialize(List<List<Integer>> list) {
        for(List<Integer> list1: list){
          List<Integer> listToUpdate = parentToChildMap.getOrDefault(list1.get(1), new ArrayList<>());
          listToUpdate.add(list1.get(0));
          parentToChildMap.put(list1.get(1),listToUpdate);

            costMap.put(list1.get(0),list1.get(2));
        }
        parentToChildMap.forEach((k,v)->System.out.println(k +" "+v));
      //  costMap.forEach((k,v)->System.out.println(k +" "+v));

        Map<Integer, List<Integer>> collect = parentToChildMap.entrySet().stream().filter(map -> map.getKey().intValue() == -1).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
       // System.out.println(collect);
        Collection<List<Integer>> values = collect.values();
      //  System.out.println(values);
        List<Integer> rootNodes = (List<Integer>) values.stream().flatMap(list1 -> list1.stream()).collect(Collectors.toList());
        System.out.println(rootNodes);

        Map<Integer,Integer> ansMap = new HashMap<>();

        for(Integer rootNode:rootNodes){
            LinkedList<Integer> queue = new LinkedList<>();
            queue.offer(rootNode);
            bfs(queue,ansMap);
            System.out.println(queue);
        }

        System.out.println(ansMap);




        //Map<Integer,Integer>  rootNodeMap = parentToChildMap.entrySet().stream().filter(map -> map.getKey().intValue()==-1).collect(Collectors.toMap(map->map.getKey(),map->map.getValue()));
        //System.out.println(rootNodeList);


    }

    private void bfs(LinkedList<Integer> queue,Map<Integer,Integer> ansMap) {
        int count=0;
        int firstElement=queue.peek();
        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            System.out.println(costMap.get(poll));
            count+=costMap.get(poll);
            List<Integer> children = parentToChildMap.get(poll);
            if(children!=null) {
                children.forEach(queue::offer);

            }
        }
        System.out.println(count);
        ansMap.put(firstElement,count);
    }


    private void createGraph(List<List<Integer>> list) {
        for (List<Integer> list1 : list) {
            if (list1.get(1) == -1) {
                parentMap.put(list1.get(0),new Node(list1.get(0), list1.get(1), list1.get(2)));
            }
            else{
                visitedList.add(new Node(list1.get(0), list1.get(1), list1.get(2)));
            }
        }
        for (List<Integer> list1 : list) {
            if (list1.get(1) != -1) {
                Node parentNode = parentMap.get(list1.get(1));
                if(parentNode!=null && parentNode.children==null){
                    List<Node> child=new ArrayList<>();
                    parentNode.children=(child);
                    parentNode.children.add(new Node(list1.get(0),list1.get(1),list1.get(2)));
                }else if(parentNode!=null && parentNode.children!=null){
                    parentNode.children.add(new Node(list1.get(0),list1.get(1),list1.get(2)));
                }
            }else{
                List<Node> child=new ArrayList<>();
                Node nodeToUpdate = null;
                if(visitedList.contains(list1.get(1))){
                        nodeToUpdate=visitedList.get(list1.get(1));
                        nodeToUpdate.parent.children.add(new Node(list1.get(0),list1.get(1),list1.get(2)));
                        nodeToUpdate.children.add(new Node(list1.get(0),list1.get(1),list1.get(2)));

                    parentMap.get(list1.get(1)).children=nodeToUpdate.children;
                    //Node parentNode1=visitedList.get(list1.get(1));
                    //parentNode1.children.add(new Node(list1.get(0),list1.get(1),list1.get(2)));
                }
            }
        }
        System.out.println(parentMap);
    }
}

class Node{
    int id;
    int parentId;

    int count;
    List<Node> children;
    Node parent;

    public Node(int id, int parentId, int count) {
        this.id = id;
        this.parentId = parentId;
        this.count = count;
    }
}

/*

We designed a protocol to exchange statistical information about different brands of hotels in an area. Brands can be owned by another brand, making up a hierarchy of brands of any number of levels, and those that are not owned by another are referred to as top-level brands.
 
Brand data is transmitted line-by-line. Each line contains a brand identifier, a parent brand identifier and a number of hotels in the area.
 
We want to write a function/method to return the k top-level brands with the highest number of hotels in all of their owned brands in the area.
 
Input
* k → max number of returned results 
* brand_info_dtos → unordered sequence of brand data
    * brand_info_dto: [ (<brand_id>, <parent_brand_id>, <hotel_count>) ] 
Output
* The sequence of k brand_ids with the highest number of properties with the format
    * [ (<brand_id>, <total_property_count>) ] 
 
Example
* Marriott Int. (id: 6, hotels: 12) is the top-level brand of Ritz-Carlton (id: 7, hotels: 34) 
* AccorHotels (id: 0, hotels: 10) is the top-level of brands:
    * Sofitel (id: 1, hotels: 43) 
    * Fairmont (id: 2, hotels: 17) 
    * Raffles (id: 3, hotels: 11) which also owns
        * Grand Mercure (id: 4, hotels: 11) 
        * …   
Input
[ [3,    0, 11]
  [6, null, 12]
  [1,    0, 43]
  [5,    3, 10]
  [0, null, 10]
  [2,    0, 17]
  [4,    3, 11]
  [7,    6, 34] ]
 k <- 2
 
Output
[ (0,102), (6,46) ]

 */
