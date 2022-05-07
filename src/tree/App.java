package tree;

public class App {

    public static void main(String[] args) {

        System.out.println("First commit to the new Algo project");
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.inorder();
        System.out.println(tree.get(29));

    }
}
