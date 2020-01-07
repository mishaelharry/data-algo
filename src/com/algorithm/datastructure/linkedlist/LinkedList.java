package com.algorithm.datastructure.linkedlist;

public class LinkedList {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);

        //if head...
        if (head == null){
            head = newNode;
            return;
        }
        //Set its next to the current head
        newNode.next = head;
        head = newNode;
    }

    public int getFirst() {
        if (head == null){
            throw new IllegalStateException("Empty linked list");
        }
        return head.data;
    }

    public int getLast() {
        if (head == null){
            throw new IllegalStateException("Empty linked list");
        }
        Node current = head;
        while (current.next != null){
            current = current.next; //0(n)
        }
        return current.data;
    }

    public void addBack(int data){
        Node newNode = new Node(data);

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

    public int size(){
        if (head == null){
            return 0;
        }
        int count = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void clear(){
        head = null;
    }

    public void deleteValue(int i) {
        if (head == null){
            return;
        }
        if (head.data == i){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null){
            if (current.next.data == i){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}
