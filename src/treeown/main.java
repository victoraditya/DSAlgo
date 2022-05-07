package treeown;

public class main {

    public static void main(String[] args) {
        BST bst = new BST();
        /*bst.add(6);
        bst.add(4);
        bst.add(9);
        bst.add(5);
        bst.add(2);
        bst.add(8);
        bst.add(12);
        bst.add(10);
        bst.add(14);*/


        bst.addIterative(6);
        bst.addIterative(4);
        bst.addIterative(9);
        bst.addIterative(5);
        bst.addIterative(2);
        bst.addIterative(8);
        bst.addIterative(12);
        bst.addIterative(10);
        bst.addIterative(14);

        bst.printTree(bst.getRoot());

      /*  //Iterative search
        Node searchResultNode = bst.searchIterative(10);
        if (searchResultNode != null) {
            System.out.println("Search Result is : " + searchResultNode.getData());
        } else {
            System.out.println("search value not found in Tree");
        }*/

        //Recursive Search

        Node serachResult = bst.recursiveSearch(14);
        if (serachResult != null) {
            System.out.println("Search Result is : " + serachResult.getData());
        } else {
            System.out.println("search value not found in Tree");
        }

    }
}
