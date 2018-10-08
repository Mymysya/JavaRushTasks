package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        String name = reader.readLine();

        int nnumber = Integer.parseInt(number);

        System.out.println(name +" захватит мир через "+nnumber+" лет. Му-ха-ха!");
    }
}
