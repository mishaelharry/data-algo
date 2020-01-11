package com.algorithm.datastructure.challenge;

import com.algorithm.datastructure.challenge.arraysAndStrings.*;
import com.algorithm.datastructure.linkedlist.LinkedList;
import com.algorithm.datastructure.linkedlist.LinkedListAdder;
import com.algorithm.datastructure.linkedlist.LinkedListLoopDetector;
import com.algorithm.datastructure.linkedlist.Node;
import com.algorithm.datastructure.stack.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList linkedList;
    private LinkedListAdder listAdder;
    private LinkedListLoopDetector loopDetector;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList();
        listAdder = new LinkedListAdder();
        loopDetector = new LinkedListLoopDetector();
    }

    @Test
    public void Duplicates(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(1);

        linkedList.removeDuplicates();

        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void SumList(){
        Stack first = new Stack();
        first.push(8);
        first.push(2);
        first.push(5);

        Stack second = new Stack();
        second.push(4);
        second.push(9);
        second.push(2);

        Stack sum = listAdder.sum(first, second);

        Assert.assertEquals(3, sum.size());

        while (!sum.isEmpty()){
            System.out.println(sum.pop());
        }
    }

    @Test
    public void LoopDetection(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        loopDetector.addBack(node1);
        loopDetector.addBack(node2);
        loopDetector.addBack(node3);
        loopDetector.addBack(node4);
        loopDetector.addBack(node5);
        loopDetector.addBack(node3);

        Assert.assertTrue(loopDetector.hasLoop());
    }
}
