package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nDay = Integer.parseInt(bufferedReader.readLine());

        if (nDay == 1) System.out.print("понедельник");
        else if (nDay == 2) System.out.print("вторник");
        else if (nDay == 3) System.out.print("среда");
        else if (nDay == 4) System.out.print("четверг");
        else if (nDay == 5) System.out.print("пятница");
        else if (nDay == 6) System.out.print("суббота");
        else if (nDay == 7) System.out.print("воскресенье");
        else System.out.print("такого дня недели не существует");
    }
}