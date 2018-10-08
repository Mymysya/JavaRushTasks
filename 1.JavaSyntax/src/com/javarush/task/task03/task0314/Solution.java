package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        for (int a=1;a<=10;a++){
            for (int b=1;b<=10;b++){

                String result;

                result = ""+a*b+" ";

                System.out.print(result);
            }
            System.out.println();
        }
    }

}
