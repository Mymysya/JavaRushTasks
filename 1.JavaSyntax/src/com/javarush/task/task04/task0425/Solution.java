package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println((a>0 && b>0)? 1 :(a<0 && b>0)? 2: (a<0 && b<0)? 3: (a>0 && b<0)? 4: null);
    }
}
