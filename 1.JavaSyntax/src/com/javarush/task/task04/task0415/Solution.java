package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        public class Solution {
            public static void main(String[] args) throws Exception {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(buf.readLine());
                int b = Integer.parseInt(buf.readLine());
                int c = Integer.parseInt(buf.readLine());
                System.out.println(((a + b) <= c || (a + c) <=  b || (b + c) <= a)?
                        "Треугольник не существует.":"Треугольник существует.");
            }
        }
    }
}