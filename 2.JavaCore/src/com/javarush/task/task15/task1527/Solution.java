package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double 3.14


Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj может быть корректно преобразовано в число типа double.
5. Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj НЕ может быть корректно преобразовано в число типа double.
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        try {
//            //String string = reader.readLine();
//            String string = "http://javarush.ru/alpha/index.html?obj=3.14&lvl=15&view&name=Amigo";
//
//            //string.split("\\?", 1);
//            String[] q = string.split("\\?", 0);
//            string = q[1];
//
//            for (String retval : string.split("&")) {
//                System.out.println(retval);
//            }
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//                String input = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
//                Pattern pattern = Pattern.compile("&(\\w*)");
//                Matcher matcher = pattern.matcher(input);
//                while(matcher.find())
//                    System.out.println(matcher.group().replaceFirst("&",""));

        //String input = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Print(input, "\\?");
        Print(input, "&");
        //Print(input,"obj=");

        Pattern pattern = Pattern.compile("obj");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            try {

                String Dinput = input.substring(input.indexOf("obj=") + 4, input.indexOf("&"));
                double a = Double.parseDouble(Dinput);

                alert(a);
            } catch (Exception e) {
                alert(input.substring(input.indexOf("obj=") + 4, input.indexOf("&")));
            }
        }
    }


    public static void Print(String input, String ch) {

        Pattern pattern = Pattern.compile(ch + "(\\w*)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            System.out.println(matcher.group().replaceFirst(ch, ""));

    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
