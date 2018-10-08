package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/
public class Solution {
    public static void main(String[] args) {

        int secondsAfter15 = secondsAfter15(1800);
        System.out.println(secondsAfter15);
    }
    public static int secondsAfter15(int seconds){
        int result = seconds % 3600;
        return result;
    }
}