package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        int a1 = a - 10;
        a1 = abs(a1);

        int b1 = b - 10;
        b1 = abs(b1);

        int result;
        if (a1<b1){
            result = a;
        }
        else{
            result = b;
        }
        System.out.println(result);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}