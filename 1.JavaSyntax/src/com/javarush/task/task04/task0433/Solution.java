package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int x = 10;
        int y = 10;
        String result = "";

        while (x != 0){
            result = result + "S";
            x--;
        }
        while (y != 0){
            System.out.println(result);
            y--;
        }

    }
}
