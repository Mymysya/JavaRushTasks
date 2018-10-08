package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nextInt = 0;
        double summ = 0;
        int i = 0;

        while (nextInt != -1){
            nextInt = Integer.parseInt(bufferedReader.readLine());

            summ += (nextInt != -1)?nextInt:0;

            i +=(nextInt != -1)?1:0;
        }
        bufferedReader.close();

        double result = summ/i;

        System.out.println(result);
    }
}

