package trie;

public class Node {
    public static final int SIZE=26;
    String prefix;
    Node [] children;

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    boolean leaf;


    Node (String prefix){
        this.prefix=prefix;
        children=new Node[SIZE];
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public Node getChild(int index){
       return this.children[index];
    }

    public void setChild(int index,Node node){
         this.children[index]=node;
    }


}
