package com.algorithm.datastructure.linkedlist;

public class LinkedListLoopDetector {

    private Node head;

    public void addBack(Node newNode){
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean hasLoop() {
        return hasLoop(head);
    }

    private boolean hasLoop(Node first) {
        Node slow = first;
        Node fast = first;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }
}
