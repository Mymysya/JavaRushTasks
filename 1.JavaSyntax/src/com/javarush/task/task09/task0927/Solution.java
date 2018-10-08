package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {

        Map<String, Cat> map = new HashMap<>();

        map.put("cat1", new Cat("cat1"));
        map.put("cat2", new Cat("cat2"));
        map.put("cat3", new Cat("cat3"));
        map.put("cat4", new Cat("cat4"));
        map.put("cat5", new Cat("cat5"));
        map.put("cat6", new Cat("cat6"));
        map.put("cat7", new Cat("cat7"));
        map.put("cat8", new Cat("cat8"));
        map.put("cat9", new Cat("cat9"));
        map.put("cat10", new Cat("cat10"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        Set<Cat> catHashSet = new HashSet<>();

        for (Map.Entry entry: map.entrySet()) {
            catHashSet.add((Cat) entry.getValue());
        }
        return catHashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
