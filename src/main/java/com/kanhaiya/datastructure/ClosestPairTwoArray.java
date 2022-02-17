package com.kanhaiya.datastructure;

public class ClosestPairTwoArray {

    static void closestPair(int[] arr1, int[] arr2, int x) {
        int indexl1 = 0, indexl2 = 0, indexR1 = arr1.length, indexR2 = arr2.length;
        int l1 = 0, l2 = 0, r1 = arr1.length - 1, r2 = arr2.length - 1;
        int diff = Integer.MAX_VALUE;
        int flag = 1;
        while (l1 < r2 || l2 < r1) {
            boolean b1 = true, b2 = true;
            if (Math.abs(arr1[l1] + arr2[r2] - x) < diff) {
                indexl1 = l1;
                indexR2 = r2;
                diff = Math.abs(arr1[l1] + arr2[r2] - x);
                flag = 1;
            }
            if (Math.abs(arr2[l2] + arr1[r1] - x) < diff) {
                indexl2 = l2;
                indexR1 = r1;
                diff = Math.abs(arr1[l2] + arr1[r1] - x);
                flag = 2;
            }

            if (arr1[l1] + arr2[r2] > x) {
                r2--;
            } else
                l1++;
            if (arr2[l2] + arr1[r1] > x) {
                r1--;
            } else
                l2++;
        }

        if (flag == 1) {
            System.out.println("The closest pair is " + arr1[indexl1] +" and " +arr2[indexR2]);
        } else {
            System.out.println("The closest pair is " + arr2[indexl2] +" and " +arr1[indexR1]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 38;
        closestPair(arr1, arr2, x);
    }
}
