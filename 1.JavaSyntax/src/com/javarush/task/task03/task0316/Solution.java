package com.javarush.task.task03.task0316;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        String s = "\\"+"\\";
        String p = "\\"+"\"";
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: "+p+"C:"+s+"Program Files"+s+"Java"+s+"jdk1.7.0"+s+"bin"+p );

    }
}
