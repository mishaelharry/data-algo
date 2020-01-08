package com.algorithm.datastructure.challenge;

public class UniqueCharacterDetector {

    public boolean isUnique(String text){
        if (text.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < text.length(); i++){
            int val = text.charAt(i);
            if (char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
