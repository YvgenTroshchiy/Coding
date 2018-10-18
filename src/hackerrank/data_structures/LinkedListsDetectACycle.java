package hackerrank.data_structures;

import java.util.ArrayList;
import java.util.List;

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/
class LinkedListsDetectACycle {

    public static void main(String[] args) {
    }

    boolean hasCycle(Node head) {
        if (head == null) return false;

        ArrayList<Node> l = new ArrayList<>();

        Node current = head;
        while (current.next != null) {

            if (l.contains(current.next)) return true;

            l.add(current);
            if (l.size() == 100) return false;

            current = current.next;
        }

        return false;
    }

    class Node {
        int data;
        Node next;
    }
}

