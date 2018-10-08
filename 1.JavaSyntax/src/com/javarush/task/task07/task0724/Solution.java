package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> list = new ArrayList<Human>();


        //4 объекта без отца и матери
        Human H1 = new Human("Виктор", true, 68);
        list.add(H1);
        Human H2 = new Human("Нина", false, 67);
        list.add(H2);

        Human H3 = new Human("Юрий", true, 65);
        list.add(H3);
        Human H4 = new Human("Светлана", false, 64);
        list.add(H4);

        Human H5 = new Human("Дмитрий", true, 45, H1, H2);
        list.add(H5);
        Human H6 = new Human("Александр", true, 41, H1, H2);
        list.add(H6);
        Human H7 = new Human("Констанин", true, 33, H1, H2);
        list.add(H7);

        Human H8 = new Human("Адрей", true, 37, H3, H4);
        list.add(H8);
        Human H9 = new Human("Александр", true, 34, H3, H4);
        list.add(H9);

        list.forEach(System.out::println);
    }

    public static class Human {
        String name = "";
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















