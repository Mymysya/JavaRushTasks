package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int m=Integer.parseInt(buffer.readLine());
        int n=Integer.parseInt(buffer.readLine());
        int d = n;

        for (; m > 0 ; m--) {
            for ( ;n > 0 ; n--) {
                System.out.print("8");
            }
            System.out.println("");
            n = d;
        }
    }
}
