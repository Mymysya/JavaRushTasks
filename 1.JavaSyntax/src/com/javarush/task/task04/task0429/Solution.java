package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iLine1 = Integer.parseInt(reader.readLine());
        int iLine2 = Integer.parseInt(reader.readLine());
        int iLine3 = Integer.parseInt(reader.readLine());
        System.out.println("количество отрицательных чисел: " + functuin2(iLine1, iLine2, iLine3));
        System.out.println("количество положительных чисел: " + functuin1(iLine1, iLine2, iLine3));
    }

    public static int functuin1(int a, int b, int c) {
        int i = 0;
        if (a > 0) {
            i++;
        }
        if (b > 0) {
            i++;
        }
        if (c > 0) {
            i++;
        }
        return i;
    }

    public static int functuin2(int a, int b, int c) {
        int i = 0;
        if (a < 0) {
            i++;
        }
        if (b < 0) {
            i++;
        }
        if (c < 0) {
            i++;
        }
        return i;
    }
}
