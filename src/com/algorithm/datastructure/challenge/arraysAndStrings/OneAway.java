package com.algorithm.datastructure.challenge.arraysAndStrings;

public class OneAway {

    public boolean oneAway(String first , String second){
        if (first.length() == second.length()){
            return OneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()){
            return OneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()){
            return OneEditInsert(second, first);
        }
        return true;
    }

    private boolean OneEditInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < second.length() && index1 < first.length()){
            if (first.charAt(index1) != second.charAt(index2)){
                if (index1 != index2){
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean OneEditReplace(String first, String second) {
        boolean foundDifference = false;
        for (int i = 0; i < first.length(); i++){
            if (foundDifference){
                return false;
            }
            if (first.charAt(i) != second.charAt(i)){
                foundDifference = true;
            }
        }
        return true;
    }

}
