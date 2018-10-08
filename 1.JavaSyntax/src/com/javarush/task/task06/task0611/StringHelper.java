package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";

        result = StringHelper.multiply(s,5);
        return result;
    }

    public static String multiply(String s, int count) {

        String result = ""; // задано
        StringBuffer buf = new StringBuffer(); // создали объект нашего буфера
        for (int i=0; i<count; i++){
            buf.append(s); // использовали команду, которая добавляет строку s к концу строки, имеющейся в буфере
        }
        result = buf.toString(); // в result вывели то, что накопилось в буфере

        return result;
    }

    public static void main(String[] args) {

    }
}
