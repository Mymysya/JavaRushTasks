package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader filename = new BufferedReader(new InputStreamReader(System.in));

        try {

            File file = new File(filename.readLine());

            // Если файл не существует, то создадим его
            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            String strLine = "";

            do {

                strLine = filename.readLine();
                bw.write(strLine+ "\r\n");
                bw.flush();

            } while (!strLine.equals("exit"));

            //e:\data.txt
            filename.close();
            bw.close();

        } catch (IOException e) {
            //System.out.println("Ошибка");
        }

    }
}
