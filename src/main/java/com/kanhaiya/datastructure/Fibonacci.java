package com.kanhaiya.datastructure;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, Integer> memoisedFib = new HashMap<>();

    public static void main(String[] args) {
        memoisedFib.put(0, 1);
        memoisedFib.put(1, 1);

        System.out.println("Fibonacci of 9th element : " + fibonacci(2));
    }

    static int fibonacci(int num) {

        if (memoisedFib.containsKey(num)) {
            return memoisedFib.get(num);
        }

        int result = fibonacci(num - 1) + fibonacci(num - 2);

        memoisedFib.put(num, result);
        return result;
    }
}
