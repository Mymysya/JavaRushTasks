package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nDay = Integer.parseInt(bufferedReader.readLine());

        boolean resuln = java.time.Year.of(nDay).isLeap();
        String x;

        if (resuln == true){
            x = "366";
        }
            else{x = "365";}
        System.out.println("количество дней в году: "+x);
    }
}