package treeprac;

public class App {

    public static void main(String[] args) {

        BSTTree bstTree = new BSTTree();

        bstTree.insert(10);
        bstTree.insert(4);
        bstTree.insert(25);

        System.out.println(bstTree.getMax());


    }


}
