package coding_interview.hackerrank.data_structures;


import java.util.LinkedList;

// Data Structures: Trees https://www.youtube.com/watch?v=oSWTXtMglKE

// Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge.
// Hint: you may want to write one or more helper functions.
public class IsThisABinarySearchTree {

    private LinkedList<Integer> list = new LinkedList<>();

    boolean checkBST(Node root) {

        printInOrder(root);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) return false;
        }

        return true;
    }

    private void printInOrder(Node root) {
        if (root.left != null) printInOrder(root.left);

        list.add(root.data);

        if (root.right != null) printInOrder(root.right);
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}
