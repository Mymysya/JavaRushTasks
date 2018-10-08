package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String astr = reader.readLine();
        String bstr = reader.readLine();
        String cstr = reader.readLine();

        int pos =0;

        if (astr.equals(bstr))
            pos = 3;
        if (astr.equals(cstr))
            pos = 2;
        if (bstr.equals(cstr))
            pos = 1;
        if (pos!=0)
            System.out.println(pos);
    }
}
