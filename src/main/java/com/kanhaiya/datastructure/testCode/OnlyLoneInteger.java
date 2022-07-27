package com.example.test;

public class OnlyLoneInteger {

    static int onlyLoner(int[] arr, int n) {
        int res = -1;
        int l = 0;
        while (l < n) {
            if (arr[l] != arr[l + 1]) {
                res = arr[l];
                break;
            } else l += 2;
        }
        if (arr[n - 2] != arr[n - 1]) {
            res = arr[n - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8, 8, 9, 10, 10};
        System.out.println("Alone integer in the arr is " + onlyLoner(arr, arr.length));
    }
}
