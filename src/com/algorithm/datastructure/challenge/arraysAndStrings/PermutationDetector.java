package com.algorithm.datastructure.challenge.arraysAndStrings;

import java.util.Arrays;

public class PermutationDetector {

    public boolean isPermutation(String text, String pem) {
        if (text.length() != pem.length()) return false;
        return sort(pem).equals(text);
    }

    private String sort(String pem){
        char[] pemChar = pem.toCharArray();
        Arrays.sort(pemChar);
        return new String(pemChar);
    }
}
