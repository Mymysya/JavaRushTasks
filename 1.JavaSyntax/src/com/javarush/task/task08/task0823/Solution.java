package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //String s = "Тестовая строка, используемая для разложения на слова.";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,");
        s = "";
        while (st.hasMoreTokens()) {

            String s1 = st.nextToken();

            s1 = s1.substring(0,1).toUpperCase() +s1.substring(1);
            s += s1+" ";
        }

        System.out.println(s);
    }
}
