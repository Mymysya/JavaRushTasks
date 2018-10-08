package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arrayCount = 10;
        String[] words = new String[10];
        int[] digits = new int[10];

        for (int i = 0; i < arrayCount; i++)
        {
            words[i] = reader.readLine();
            digits[i] = words[i].length();
        }

        for (int i = 0; i < arrayCount; i++)
            System.out.println(digits[i]);
    }
}
