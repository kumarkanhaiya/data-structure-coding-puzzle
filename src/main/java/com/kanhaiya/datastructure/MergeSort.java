package com.kanhaiya.datastructure;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = new int[]{-5, 20, 10, 3, 2, 0};
        mergeSort(data, 0, data.length - 1);
        for (int i :
                data) {
            System.out.print(" " + i);
        }
    }

    public static void mergeSort(int data[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;
        int temp[] = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        //add the rest of the left sub array if any
        while (i <= mid) {
            temp[k++] = data[i++];
        }

        //add the rest of the right sub array if any
        while (j <= end) {
            temp[k++] = data[j++];
        }

        for (i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }
    }
}

