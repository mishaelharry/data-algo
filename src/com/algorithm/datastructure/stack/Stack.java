package com.algorithm.datastructure.stack;

import com.algorithm.datastructure.linkedlist.Node;

import java.util.EmptyStackException;

public class Stack {

    private Node head; // add and remove things here
    private int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void push(int data) {
        // Create new node
        // Set it's next to be head
        // Set head to be the new node

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        // Store the value you want to return
        // Set the current head.next to be the new head
        // return the value

        if (head == null) throw new EmptyStackException();

        int data = head.data;
        head = head.next;
        size--;

        return data;
    }

    public int size() {
        return size;
    }
}