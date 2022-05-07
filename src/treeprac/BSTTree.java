package treeprac;

public class BSTTree {

    Node root;

    public void insert(int key) {

        insertRecursive(root, key);

    }

    private void insertRecursive(Node root, int key) {

        if (root == null) {
            root = new Node(key);
        } else if (key < root.getData()) {
            insertRecursive(root.getLeftChild(), key);
        } else {
            insertRecursive(root.getRightChild(), key);
        }

    }

    public int getMax() {

        while (root != null) {
            root = root.getLeftChild();
        }
        return root.getData();

    }
}
