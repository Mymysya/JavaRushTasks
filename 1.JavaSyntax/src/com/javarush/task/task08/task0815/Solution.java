package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap <String,String> map = new HashMap<String,String>();

        for (int i =1;i<=10;i++) {
            map.put("Surname"+i,"name"+i);
        }

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int count = Collections.frequency(new ArrayList<String>(map.values()), name);
        return  count;
    }



    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = Collections.frequency(new ArrayList<String>(map.keySet()), lastName);
        return  count;

    }

    public static void main(String[] args) {

    }
}
