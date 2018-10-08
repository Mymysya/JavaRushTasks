package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        ArrayList <String> listS = new ArrayList<>();
        ArrayList <Integer> listI = new ArrayList<>();

        HashMap<Integer,String> map = new HashMap<>();
        for (int i=0;i<array.length;i++) {

            String s = array[i];
            String value = "";

            if (isNumber(s)) {
                listI.add(Integer.parseInt(s));
                value = "i";
            } else {
                listS.add(s);
                value = "s";
            }

            map.put(i,value);
        }

        //////////////////////////////////////
//        Collections.sort(listS);

        for(int i = 0; i < listS.size(); i++) { // шагаем по массиву, ищем первое вхождение строки
                for (int c = i + 1; c < listS.size(); c++) { // шагаем по массиву, ищем второе вхождение строки
                        if (isGreaterThan(listS.get(i), listS.get(c))) { // сравниваем два вхождения
                            String tmp = listS.get(i);                // меняем их местами, если

                            listS.set(i,listS.get(c));                // первое больше второго.
                            listS.set(c,tmp);
                        }}}


        Collections.sort(listI,Collections.reverseOrder());

        for (Map.Entry entry: map.entrySet()) {
            int i = (int) entry.getKey();
            String value = (String) entry.getValue();

            if (value == "i") {
                array[i] = listI.get(0).toString();
                listI.remove(0);
            }else{
                array[i] = listS.get(0);
                listS.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
