package tree;

public class TreeNode {

    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void insert(int value) {
        if (value == data)
            return;
        if (value > data) {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        } else {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            leftChild.insert(value);
        }
    }

    public void inorder() {
        if (leftChild != null) {
            leftChild.inorder();
        }
        System.out.println(data);
        if (rightChild != null) {
            rightChild.inorder();
        }
    }

    public TreeNode get(int value) {
        if (value == data)
            return this;
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (leftChild != null) {
                return rightChild.get(value);
            }

        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
