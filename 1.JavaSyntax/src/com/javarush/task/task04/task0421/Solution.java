package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String a2 = reader.readLine();

        if (a1.equals(a2)){
            System.out.println("Имена идентичны");
        }
        else if (a1.length() == a2.length()){
            System.out.println("Длины имен равны");
        }
        else{

        }
    }
}
