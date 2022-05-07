package design;/*
package design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMapMain {

    int key;
    int value;
    List<Node> list = new ArrayList<>();
    //put
    MyHashMap myHashMap = new MyHashMap();

    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 11);
        Node node = myHashMap.get(1);
        System.out.println(node.key+" "+node.value);
        myHashMap.put(1, 12);
        Node node1 = myHashMap.get(1);
        System.out.println(node1.key+" "+node1.value);

    }

    //get
    //delete
    Node Node = new Node();


}

class MyHashMap {

    List<Node> array [] = new LinkedList[this.size];
    int size = 1000;

    MyHashMap() {
    }



    public Node get(int key) {
        int index = myHash(key);

        int i = array[index].indexOf(new Node(key));
    }

    public void put(Integer key, Integer value) {

        Integer index = myHash(key);
        if(array.(key)){
            list.remove(index);
        }
        System.out.println(list);
        Node node = new Node();
        node.key = key;
        node.value = value;
        list.add(index, node);
    }

    private int myHash(Integer key) {
        int index = (key.hashCode() % size);
        System.out.println("hashcode of key+ "+key+" "+key.hashCode());
        return index;
    }


}

class Node {
    int key, value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Node() {

    }
    
    public Node(int key){
        this.key=key;
    }


}
*/
