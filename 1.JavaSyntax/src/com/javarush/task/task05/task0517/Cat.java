package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int weight = 5;
    int age = 4;
    String color = "black";
    String address = null;

    public Cat(String name){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color  = color;
    }
    public Cat(int weight, String collor){
        this.weight = weight;
        this.color = collor;
    }

    public Cat(int weight, String collor, String address){
        this.weight = weight;
        this.address = address;
        this.color = collor;
    }

     public static void main(String[] args) {

    }
}
