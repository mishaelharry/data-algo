package com.algorithm.datastructure.challenge;

public class OneAway {

    public boolean oneAway(String one , String away){
       if (one.length() != away.length()) return true;

        int count = 0;
        char[] valOne = one.toCharArray();
        char[] valAway = away.toCharArray();
        for (int i = 0; i < valOne.length; i++){
            for (int j = 0; j < valAway.length; j++){
                if (valOne[i] != valAway[j]){
                    count++;
                }
            }
        }
        if (count > 1){
            return true;
        }
        return false;
    }
}
