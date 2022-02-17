package com.kanhaiya.datastructure;

public class ClosestPair {

    static void closestPairVal(int []arr, int n, int x){
        int resLeft = 0;
        int resRight = 0;
        int diff = Integer.MAX_VALUE;
        int l = 0;
        int r = n-1;
        while(l < r){
            if(Math.abs(arr[l] + arr[r] - x) < diff){
                diff = Math.abs(arr[l] + arr[r] - x);
                resLeft = l;
                resRight = r;
            }
            if(arr[l] + arr[r] > x)
                r--;
            else
                l++;
        }

        System.out.println("The closest pair is : " +arr[resLeft] +" " +arr[resRight]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int x = 90;
        closestPairVal(arr, arr.length, x);
    }
}
