package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Требования:
1. Программа должна 10 раз считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

/*
* Регулярка
1 Использовать StringUtils.countMatches из org.apache.commons.lang3.StringUtils

int occurrence = StringUtils.countMatches("a,b,c,d", ",");
System.out.println(occurrence);

2 Использовать string.split

String string = "a,b,c,d";
String []splitArray = string.split("\\,");
System.out.println("Запятых тут : " + (splitArray.length - 1) + " штук.");

3 String testString =  "a,b,c,d";
int occurrencesCount = testString.length() - testString.replace(",", "").length();
System.out.println(occurrencesCount);

4 Java8

String testString =  "a,b,c,d";
long occurrencesCount = testString.chars().filter(ch -> ch == ',').count();
System.out.println(occurrencesCount);
Еще какой-нибудь способ

UPD нашел подобную тему на enSO: How do I count the number of occurrences of a char in a String?, несколько примеров оттуда:

Spring Framework

5 int spring = org.springframework.util.StringUtils.countOccurrencesOf(testString, ",");
System.out.println("spring = " + spring);
replaceAll

6 int replaceAll = testString.replaceAll("[^,]", "").length();
System.out.println("replaceAll = " + replaceAll);
Java8

7 long java8 = testString.codePoints().filter(ch -> ch == ',').count();
System.out.println("java8 = " + java8);
StringTokenizer

8 int stringTokenizer = new StringTokenizer(" " +testString + " ", ",").countTokens()-1;
System.out.println("stringTokenizer = " + stringTokenizer);
Но в данном случае надо быть осторожным, так как, например, для строки a.b.c.d этот пример будет работать, а для строки a...b.c....d или ...a.b.c.d или a....b......c.....d... и т.д. — не будет. В итоге последовательность точек между каждой из букв посчитается лишь за один символ.

поделитьсяулучшить этот от
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String result = "";
        for (String sl:list) {
            result += sl;
        }

        for (Character c:alphabet) {

            long occurrencesCount = result.chars().filter(ch -> ch == c).count();
            System.out.println(c+" "+occurrencesCount);
        }
    }

}
