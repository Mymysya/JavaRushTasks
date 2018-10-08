package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("surnam1","Kot");
        map.put("surnam2","Kot");
        map.put("surnam3","Kot");
        map.put("surnam4","Kot");
        map.put("surnam5","Kot1");
        map.put("surnam6","Kot1");
        map.put("surnam7","Kot1");
        map.put("surnam8","Kot1");
        map.put("surnam9","Kot1");
        map.put("surnam10","Ko3");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<>(map.values());

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Integer item;

        for (String wrd : list) {

            item = hm.get(wrd);
            if (item == null) hm.put(wrd, 1); // если нет в списке то добавить со значением 1
            else {hm.put(wrd, item + 1);
                removeItemFromMapByValue(map,wrd);
            };
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String,String> map = createMap();
//
//        removeTheFirstNameDuplicates(map);
//
//        HashMap<String, String> copy = new HashMap<String, String>(map);
//        for (Map.Entry<String, String> pair : copy.entrySet()) {
//
//            System.out.println(pair.getKey()+" - "+pair.getValue());
//        }
    }
}
