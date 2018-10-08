package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Vasya1",100);
        map.put("Vasya2",200);
        map.put("Vasya3",300);
        map.put("Vasya4",400);
        map.put("Vasya5",500);
        map.put("Vasya6",600);
        map.put("Vasya7",700);
        map.put("Vasya8",800);
        map.put("Vasya9",900);
        map.put("Vasya10",1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {

            if (pair.getValue()<500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//
//        HashMap<String,Integer> map = createMap();
//
//        removeItemFromMap(map);
//
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//
//            System.out.println(pair.getKey()+" - "+pair.getValue());
//        }
    }
}