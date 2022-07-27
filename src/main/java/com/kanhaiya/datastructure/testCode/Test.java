package com.example.test;

public class Test {
    public static void main(String[] args) {
        //System.out.println("test");

        int line = 7;
        for (int i = 1; i <=7; i++){
            for(int j = 1; j <= line - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
