package com.algorithm.datastructure.challenge.arraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterDetector {

    public boolean isUnique(String text){
        Set<Character> temp = new HashSet<>();
        char[] textChar = text.toCharArray();
        for (int i = 0; i < textChar.length; i++){
            if (!temp.contains(textChar[i])){
                temp.add(textChar[i]);
            } else {
                return false;
            }
        }
        return true;

        /*if (text.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < text.length(); i++){
            int val = text.charAt(i);
            if (char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;*/
    }
}
