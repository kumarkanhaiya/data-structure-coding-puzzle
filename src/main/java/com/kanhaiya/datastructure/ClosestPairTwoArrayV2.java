package com.kanhaiya.datastructure;

public class ClosestPairTwoArrayV2 {

    static void closestPair(int[] arr1, int[] arr2, int x) {
        int indexl1 = 0, indexR2 = arr2.length;
        int l1 = 0;
        int r2 = arr2.length - 1;
        int diff = Integer.MAX_VALUE;
        while (l1 < arr1.length && r2 >= 0) {
            if (Math.abs(arr1[l1] + arr2[r2] - x) < diff) {
                indexl1 = l1;
                indexR2 = r2;
                diff = Math.abs(arr1[l1] + arr2[r2] - x);
            }
            if (arr1[l1] + arr2[r2] > x) {
                r2--;
            } else
                l1++;
        }
        System.out.println("The closest pair is " + arr1[indexl1] + " and " + arr2[indexR2]);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40, 45, 46};
        int x = 36;
        closestPair(arr1, arr2, x);

    }
}
