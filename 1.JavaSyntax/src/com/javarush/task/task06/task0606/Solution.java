package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int len = number.length();
        int num = Integer.parseInt(number);

        for(int i = 0; i < len; i++) {
            if (num % 2 == 0)
                even++;
            else if (num % 2 != 0)
                odd++;
            num = num / 10;
        }

        System.out.println("Even: " + even +" Odd: " + odd);

    }
}