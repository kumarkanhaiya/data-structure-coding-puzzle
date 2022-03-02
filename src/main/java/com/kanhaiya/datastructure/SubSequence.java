package com.kanhaiya.datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SubSequence {
    public static void main(String[] args) {
        List arrayI = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 11, 11, 11, 11);
        List sequenceI = Arrays.asList(1, 6, -1, 10, 11, 11, 11, 11);
        System.out.println(isValidSubsequence(arrayI, sequenceI));
    }

    /*public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        if(sequence.size() > array.size())
            return false;

        int i = 0;
        int j = 0;

        for(; i < sequence.size() && j < array.size(); i++){
            boolean isFound = false;
            for(; j < array.size(); j++) {
                if(Objects.equals(sequence.get(i), array.get(j))){
                    isFound = true;
                    j++;
                    break;
                }
            }
            if(!isFound) {
                return false;
            }
        }
        if(i == sequence.size()) {
            return true;
        }
        return false;
    }*/

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrIndex = 0;
        int seqIndex = 0;
        while (arrIndex < array.size() && seqIndex < sequence.size()){
            if(sequence.get(seqIndex) == array.get(arrIndex)){
               seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }
}
