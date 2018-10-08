package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat3 = new Cat("a1",3,3,3);
        Cat cat2 = new Cat("a2",2,2,2);
        Cat cat1 = new Cat("a3",1,1,1);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}