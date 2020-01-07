package com.algorithm.datastructure.hashtable;

public class HashTable {

    private int INITIAL_SIZE = 16;
    private HashEntry[] data;

    class HashEntry {
        String key;
        String value;
        HashEntry next;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public HashTable() {
        this.data = new HashEntry[INITIAL_SIZE];
    }

    public void put(String key, String value){
        int index = getIndex(key);

        HashEntry entry = new HashEntry(key, value);

        if (data[index] == null){
            data[index] = entry;
        } else {
            HashEntry entries = data[index];
            while (entries.next != null){
                entries = entries.next;
            }
            entries.next = entry;
        }
    }

    public String get(String key){
        int index = getIndex(key);

        HashEntry entries = data[index];

        if (entries != null){
            while (!entries.key.equals(key) && entries.next != null){
                entries = entries.next;
            }
            return entries.value;
        }
        return null;
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode();
        System.out.println("hashCode = " + hashCode);

        int index = (hashCode & 0x7fffffff) % INITIAL_SIZE;
        System.out.println("index = " + index);

        if (key.equals("John Smith") || key.equals("Sandra Dee")){
            index = 4;
        }
        return index;
    }

}
