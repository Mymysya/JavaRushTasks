package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String number1 = reader.readLine();
        String number2 = reader.readLine();

        int nnumber1 = Integer.parseInt(number1);
        int nnumber2 = Integer.parseInt(number2);

        System.out.println(name +" получает "+nnumber1+" через "+nnumber2+" лет.");
    }
}
