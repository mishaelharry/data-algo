package com.algorithm.datastructure.array;

public class DynamicArray<T> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.data = new Object[initialCapacity];
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public void insert(int index, T value){
        //Check size
        if (size == initialCapacity){
            resize();
        }

        //Copy up
        for (int j = size; j > index; j--){
            data[j] = data[j - 1];
        }

        data[index] = value;
        size++;
    }

    public void delete(int index){
        //Copy down
        for (int j = index; j < size - 1; j++){
            data[j] = data[j + 1];
        }
        size--;

        //Clear if last element in array
        if (index == size){
            data[index] = null;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(T value){
        for (int i = 0; i <= size - 1; i++){
            String currentValue = (String)data[i];
            if (currentValue.equals(value)){
                return true;
            }
        }
        return false;
    }

    private void resize(){
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++){
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        if (size == initialCapacity){
            resize();
        }
        data[size] = value;
        size++;
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println("data[i] = " + data[i]);
        }
    }
}
