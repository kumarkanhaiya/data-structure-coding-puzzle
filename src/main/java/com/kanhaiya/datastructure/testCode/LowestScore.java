package com.example.test;

import java.util.Arrays;

public class LowestScore {

    public static void main(String[] args) {

        int n = 10;
        int arr[] = {2, 16, 4, 8, 6, 28, 17, 10, 1, 3};

        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;

        for(int i=0; i<n/2; i++){

            int temp = arr[n/2 + i] - arr[i];
            if(temp< res)
                res = temp;
        }

        System.out.println("The lowest score is : " +res);
    }
}
