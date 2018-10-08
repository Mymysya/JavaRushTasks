package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());

            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);

            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
            System.out.println(dateFormat.format(cal.getTime()).toUpperCase());

        } catch (ParseException e) {
        }
    }
}
