package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];

        arr[8] = "world!";
        arr[9] = "Hello";

        for (int i = 0; i < 8; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}