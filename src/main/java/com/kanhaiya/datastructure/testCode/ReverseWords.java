package com.example.test;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String [] words = input.split(" ");
        String res = "";
        int length = words.length;
        for(int i = 0; i < length; i++ ){
            res = res + words[length - i - 1] +" " ;
        }
        System.out.println(res);
    }
}
