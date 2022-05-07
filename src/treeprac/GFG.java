package treeprac;

// Java implementation to count
// the path which forms an A.P.
import java.util.*;

class GFG{

    int count = 0;

    // Node structure
    static class Node
    {
        int val;

        // left and right child of the node
        Node left, right;

        // Initialization consutructor
        Node(int x)
        {
            val = x;
            left = null;
            right = null;
        }
    };

    // Function to check if path
// forma A.P. or not
    static boolean check(Vector<Integer> arr)
    {
        if (arr.size() == 1)
            return true;

        // If size of arr is greater than 2
        int d = arr.get(1) - arr.get(0);

        for(int i = 2; i < arr.size(); i++)
        {
            if (arr.get(i) - arr.get(i - 1) != d){
                arr.removeElementAt(arr.size()-1);
                return false;}
        }
        arr.removeElementAt(arr.size()-1);
        return true;
    }

    // Function to find the maxmimum
// setbits sum from root to leaf
    static int countAP(Node root,
                       Vector<Integer> arr)
    {
        if (root == null)
            return 0;

        arr.add(root.val);

        // If the node is a leaf node
        if (root.left == null &&
                root.right == null)
        {
            if (check(arr))
                return 1;
            return 0;
        }

        // Traverse left subtree
        int x = countAP(root.left, arr);

        // Traverse the right subtree
        int y = countAP(root.right, arr);

        return x + y;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(5);
        root.left.right = new Node(7);
        root.right.left = new Node(11);
        root.right.right = new Node(23);

        System.out.print(countAP(root, new Vector<Integer>()));
    }
}

// This code is contributed by gauravrajput1

