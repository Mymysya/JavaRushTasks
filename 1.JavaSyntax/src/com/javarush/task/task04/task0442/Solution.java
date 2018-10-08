package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nextInt = 0;
        int summ = 0;

        while (nextInt != -1){
            nextInt = Integer.parseInt(bufferedReader.readLine());
            summ += nextInt;
        }
        bufferedReader.close();
        System.out.println(summ);
    }
}
