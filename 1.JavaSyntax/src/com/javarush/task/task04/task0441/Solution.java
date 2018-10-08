package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int num1=Integer.parseInt(buffer.readLine());
        int num2=Integer.parseInt(buffer.readLine());
        int num3=Integer.parseInt(buffer.readLine());

        int [] arr = new int [3];      // создаем массив
        arr [0] = num1;               // присваивам массиву введенное число.
        arr [1] = num2;               // присваивам массиву введенное число.
        arr [2] = num3;               // присваивам массиву введенное число.
        Arrays.sort(arr);               // сортируем массив по возрастанию.
        System.out.println(arr[1]);
    }
}
