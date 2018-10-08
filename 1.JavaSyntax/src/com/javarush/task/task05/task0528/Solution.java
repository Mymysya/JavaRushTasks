package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int Date = calendar.get(Calendar.DAY_OF_MONTH);
        int Month = calendar.get(Calendar.MONTH);
        int Year = calendar.get(Calendar.YEAR);

        System.out.println(""+Date+" "+((Month<10)?"0":"")+(Month+1)+" "+Year);
    }
}
