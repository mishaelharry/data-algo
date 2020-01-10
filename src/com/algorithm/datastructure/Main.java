package com.algorithm.datastructure;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        List<Integer> alice = new ArrayList<>();
        alice.add(17);
        alice.add(28);
        alice.add(30);

        List<Integer> bob = new ArrayList<>();
        bob.add(99);
        bob.add(16);
        bob.add(8);

        System.out.println(compareTriplets(alice, bob));
        System.out.println(sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    static int sockMerchant(int n, int[] ar) {
        Set<Integer> temp = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < n; i++){
            if(!temp.contains(ar[i])){
                temp.add(ar[i]);
            } else {
                pairs++;
                temp.remove(ar[i]);
            }
        }
        return pairs;
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoint = 0;
        int bobPoint = 0;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                alicePoint++;
            } else if(a.get(i) < b.get(i)){
                bobPoint++;
            }
        }
        result.add(alicePoint);
        result.add(bobPoint);

        return result;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primary = 0;
        int secondary = 0;

        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                if(i == j){
                    primary += arr.get(i).get(j);
                }

                if ((i + j) == (arr.size() - 1))
                    secondary += arr.get(i).get(j);
            }
        }
        return Math.abs(primary - secondary);

    }

    public int fib(int n){
        if (n <= 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
