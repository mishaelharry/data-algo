package com.algorithm.datastructure.binaryheap;

public class MaxIntHeap {

    private int capcity = 10;
    private int size = 0;

    public int[] items = new int[capcity];

    private int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int parentIndex(int childIndex){
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    private boolean hasParent(int index){
        return parentIndex(index) >= 0;
    }

    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private int parent(int index) {
        return items[parentIndex(index)];
    }

    public void insert(int item) {
        //ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) < items[index]){
            //swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    public void heapifyDown(){
        int index = 0;

        while (hasLeftChild(index)){

        }
    }

    public void print() {
        int index = 0;

    }
}
