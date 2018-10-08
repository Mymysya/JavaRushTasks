package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());

        ArrayList <Integer> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        Collections.sort(list);
        Collections.reverse(list);

        int size= list.size();
        String pString = "";

        for (int i=0;i<size;i++){

            String Simvol = (i==0)?"":" ";
            pString = pString +Simvol+list.get(i).toString();
        }
        System.out.println(pString);
    }
}
