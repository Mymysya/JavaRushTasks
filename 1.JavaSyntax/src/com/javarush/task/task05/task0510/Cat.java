package com.javarush.task.task05.task0510;

/* 
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    String name = null;
    int weight = 5;
    int age = 4;
    String color = "black";
    String address = null;

    public void initialize(String name){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public void initialize(int weight, String collor){
        this.weight = weight;
        this.color = collor;
    }

    public void initialize(int weight, String collor, String address){
        this.weight = weight;
        this.address = address;
        this.color = collor;
    }

    public static void main(String[] args) {

    }
}
