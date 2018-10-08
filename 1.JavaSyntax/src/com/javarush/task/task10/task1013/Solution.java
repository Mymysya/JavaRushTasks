package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String a1;
        private Integer a2;
        private boolean a3;
        private String a4;
        private double a5;
        private long a6;

        public Human(String a){
            this.a1 = a;
        }
        public Human(Integer a){
            this.a2 = a;
        }
        public Human(boolean a){
            this.a3 = a;
        }
        public Human(String b1,Integer b2){
            this.a1 = b1;
            this.a2 = b2;
        }
        public Human(String b1,boolean b3){
            this.a1 = b1;
            this.a3 = b3;
        }
        public Human(Integer b2,boolean b3){
            this.a2 = b2;
            this.a3 = b3;
        }
        public Human(boolean b3,String b4){
            this.a3 = b3;
            this.a4 = b4;
        }
        public Human(long b5,long b6){
            this.a5 = b5;
            this.a6 = b6;
        }
        public Human(String b1,Integer b2,boolean b3){

            this.a1 = b1;
            this.a2 = b2;
            this.a3 = b3;
        }
        public Human(String b4,double b5, long b6){

            this.a4 = b4;
            this.a5 = b5;
            this.a6 = b6;
        }
    }
}
