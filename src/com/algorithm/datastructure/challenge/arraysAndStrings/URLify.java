package com.algorithm.datastructure.challenge.arraysAndStrings;


public class URLify {

    public String urlify1(String text){
        return text.replace(" ", "%20");
    }

    public String urlify2(String text){
        int totalText = (text.trim().length() - countSpace(text)) + (countSpace(text) * 3);
        char[] urlSlot = new char[totalText];
        char[] urlChar = text.toCharArray();

        int pointer = 0;
        for (int i = 0; i < urlChar.length; i++){
            if (urlChar[i] != ' ') {
                urlSlot[pointer] = urlChar[i];
                pointer++;
            } else {
                urlSlot[pointer] = '%';
                urlSlot[pointer+1] = '2';
                urlSlot[pointer+2] = '0';
                pointer = pointer + 3;
            }
        }
        return String.valueOf(urlSlot);
    }

    private int countSpace(String text){
        int space = 0;
        char[] slots = text.toCharArray();
        for (int i = 0; i < slots.length; i++){
            if (slots[i] == ' '){
                space++;
            }
        }
        return space;
    }
}
