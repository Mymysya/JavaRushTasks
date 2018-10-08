package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s = buffer.readLine();

        for(int i = 1; i <= 10; i++) System.out.println(s + " любит меня.");

    }
}
