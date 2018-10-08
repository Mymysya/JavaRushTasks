package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    //напишите тут ваш код
    private static ArrayList<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {

        String max = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(i, reader.readLine());

            if (strings.get(i).length() > max.length()) max = strings.get(i);
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == max.length()) System.out.println(strings.get(i));
        }

    }
}