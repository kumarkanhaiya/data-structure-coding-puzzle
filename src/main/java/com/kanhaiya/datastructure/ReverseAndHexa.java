package com.kanhaiya.datastructure;

import java.util.Scanner;

public class ReverseAndHexa {

    static String res = "";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println(reverseHexa(input));
    }

    static String reverseHexa(int input) {
        String rev = "";
        while (input > 0) {
            rev += input % 10;
            input = input / 10;
        }
        int reversed = Integer.parseInt(rev);

        String tempResultString = "";

        String binary = binaryConv(reversed);
        int k = binary.length() - 1;
        for (int i = binary.length() - 1; i >= 0; ) {
            int temp = 0;
            for (int j = 0; i >= 0 && j < 4; j++) {
                int raised = (int) Math.pow(2, j);
                temp = temp + Integer.parseInt(binary.charAt(i) + "") * raised;
                i -= 1;
                k -= 1;
            }
            switch (temp) {
                case 10:
                    tempResultString += "A";
                    break;
                case 11:
                    tempResultString += "B";
                    break;
                case 12:
                    tempResultString += "C";
                    break;
                case 13:
                    tempResultString += "D";
                    break;
                case 14:
                    tempResultString += "E";
                    break;
                case 15:
                    tempResultString += "F";
                    break;
                default:
                    tempResultString += String.valueOf(temp);
                    break;
            }
        }
        StringBuilder resultString = new StringBuilder(tempResultString);
        resultString.reverse();

        return resultString.toString();

    }

    static String binaryConv(int num) {
        if (num == 0) {
            return res;
        }
        res = num % 2 + res;
        return binaryConv(num / 2);
    }
}
