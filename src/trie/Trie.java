package trie;

public class Trie {
    private Node root;

    Trie(){
        root=new Node("");
    }

    //insert
    public void insert(String word){
        Node tempNode = root;
            for(int i=0;i<word.length();i++){
                Character c=word.charAt(i);
                int indexOfChar = c-'a';

                if(tempNode.getChildren()[indexOfChar]==null){
                    Node node = new Node(String.valueOf(c));
                    tempNode.setChild(indexOfChar,node);
                    tempNode=node;
                }else{
                    tempNode=tempNode.getChild(indexOfChar);
                }
            }
            tempNode.setLeaf(true);
    }

    //search
    public boolean search(String key){
        Node tempNode = root;
        for(int i=0;i<key.length();i++){
            int indexOfChar=key.charAt(i)-'a';
            if(tempNode.getChild(indexOfChar)==null){
                return false;
            }else{
               tempNode = tempNode.getChild(indexOfChar);
            }
        }
        if(tempNode.isLeaf()==false) return false;
        return true;
    }

    //autocomplete
}
