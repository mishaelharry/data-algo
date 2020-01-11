package com.algorithm.datastructure.creditcard;

import java.util.ArrayList;
import java.util.Arrays;

public class CreditCard {

    private String name;
    private ArrayList<String> prefixes;
    private ArrayList<Integer> lengths;

    public String getName() {
        return name;
    }

    public CreditCard(String name, String[] prefixes, Integer[] lengths) {
        this.name = name;
        this.prefixes = new ArrayList<>(Arrays.asList(prefixes));
        this.lengths = new ArrayList<>(Arrays.asList(lengths));
    }

    public boolean matches(String cardNumber){
        if (!lengths.contains(cardNumber.length())){
            return false;
        }

        boolean matchesPrefix = false;
        for (String prefix: prefixes){
            if (cardNumber.startsWith(prefix)){
                matchesPrefix = true;
            }
        }
        return matchesPrefix;
    }
}
