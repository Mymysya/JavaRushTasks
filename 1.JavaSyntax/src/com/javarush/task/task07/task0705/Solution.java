package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int num [] = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num.length; i++) {
            int x = Integer.parseInt(reader.readLine());
            num[i] = x;
        }

        int chapter1 [] = new int [10];
        for (int i = 0; i < 10; i++) {
            chapter1[i] = num[i];
        }

        int chapter2 [] = new int [10];
        for (int i = 0; i < 10; i++) {
            chapter2[i] = num[10+i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(chapter2[i]);
        }

        //напишите тут ваш код
    }
}