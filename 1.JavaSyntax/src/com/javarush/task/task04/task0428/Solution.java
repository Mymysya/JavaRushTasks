package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int iLine1 = Integer.parseInt(reader.readLine());
        int iLine2 = Integer.parseInt(reader.readLine());
        int iLine3 = Integer.parseInt(reader.readLine());

        int i = 0;
        if (iLine1 > 0) {
            i++;
        }
        if (iLine2 > 0) {
            i++;
        }
        if (iLine3 > 0) {
            i++;
        } System.out.println(i);

    }
}
