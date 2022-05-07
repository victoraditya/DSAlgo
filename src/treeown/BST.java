package treeown;

public class BST {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean add(int value) {
        root = recursive_insert(this.root, value);
        return true;
    }

    public Node recursive_insert(Node currentNode, int value) {
        if (currentNode == null)
            return currentNode = new Node(value);
        if (value > currentNode.getData()) {
            currentNode.setRightChild(recursive_insert(currentNode.getRightChild(), value));
        } else if (value < currentNode.getData()) {
            currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(), value));
        } else {
            return currentNode;
        }
        return currentNode;

    }

    public void printTree(Node current) {
        if (current == null) return;

        System.out.println(current.getData());
        printTree(current.getLeftChild());
        printTree(current.getRightChild());

    }

    public boolean addIterative(int value) {
        if (root == null) {
            root = new Node(value);
            return true;
        }
        Node current = root;
        while (current != null) {
            Node leftChild = current.getLeftChild();
            Node rightChild = current.getRightChild();

            if (value > current.getData()) {
                if (rightChild == null) {
                    rightChild = new Node(value);
                    current.setRightChild(rightChild);
                    return true;
                }
                current = rightChild;
            } else {
                if (leftChild == null) {
                    leftChild = new Node(value);
                    current.setLeftChild(leftChild);
                    return true;
                }
                current = leftChild;
            }

        }

        return false;

    }

    public Node searchIterative(int value) {

        if (root == null) return null;

        Node current = root;
        while (current != null) {

            if (value == current.getData()) {
                return current;
            } else if (value < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        return null;
    }

    public Node recursiveSearch(int value) {

        return recursiveSearch(root, value);

    }

    public Node recursiveSearch(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (root.getData() == value) {
            return root;
        } else if (value < root.getData()) {
            root = root.getLeftChild();
            return recursiveSearch(root, value);
        } else {
            root = root.getRightChild();
            return recursiveSearch(root, value);
        }

    }

}
