package com.kanhaiya.datastructure;

public class RotateArr {
    static void leftRotate(int[] arr, int n, int d) {
        int[] tempArr = new int[n];

        for (int i = 0; i < n; i++) {
            if (i - d < 0) {
                int shift = Math.abs(i - d);
                tempArr[n - shift] = arr[i];
            } else {
                tempArr[i - d] = arr[i];
            }
        }
        System.out.println("Array after rotation : ");
        for (int i : tempArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        leftRotate(arr, arr.length, d);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int m = 16;
        RotateArrV2.leftRotate(a, a.length, m);

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int m1 = 16;
        RotateArrV3Reversal.leftRotate(a1, a1.length, m1);

        int[] a2 = {1, 2, 3, 4, 5, 6, 7};
        int m2 = 2;
        RotateArrV4BlockMove.leftRotateRec(a2, 0, m2, a2.length);
        RotateArrV4BlockMove.printArray(a2, a2.length);
    }
}

class RotateArrV2 {
    static void leftRotate(int[] arr, int n, int d) {
        d %= n;
        int l;
        int gcd = gcd(d, n);
        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            int t = i;
            while (true) {
                l = t + d;
                if (l >= n) {
                    l = l - n;
                }
                if (l == i) break;
                arr[t] = arr[l];
                t = l;
            }
            arr[t] = temp;
        }

        System.out.println("\nArray after rotation v2 : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

class RotateArrV3Reversal {
    static void leftRotate(int[] arr, int n, int d) {
        d %= n;
        reversal(arr, 0, d - 1);
        reversal(arr, d, n - 1);
        reversal(arr, 0, n - 1);
        System.out.println("\nArray after rotation v3 : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reversal(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}

class RotateArrV4BlockMove {

    public static void leftRotateRec(int arr[], int i,
                                     int d, int n) {
        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if (d == 0 || d == n)
            return;

        /*If number of elements to be rotated
        is exactly half of array size */
        if (n - d == d) {
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if (d < n - d) {
            swap(arr, i, n - d, d);
            leftRotateRec(arr, i, d, n - d);
        } else /* If B is shorter*/ {
            swap(arr, i, d + i, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }

    static void swap(int[] arr, int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        System.out.println("\nArray after rotation v4 : ");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
