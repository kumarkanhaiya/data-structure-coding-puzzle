package com.kanhaiya.datastructure.recursive;

public class DecimalToBinary {

    static String res = "";
    static String printBinary(int num){
        if(num == 0) {
            return res;
        }
        res = num % 2 + res;
        return printBinary(num/2);
    }

    public static void main(String[] args) {
        printBinary(13);
        System.out.println(res);
    }
}
