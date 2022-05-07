package treeprac;

public class Node {

    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node() {
    }

    Node(int data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    private void insert(Node root, int data) {

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
