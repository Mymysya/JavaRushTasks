package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        //int b = Integer.parseInt(reader.readLine());

        //.out.println((a>0 && b>0)? 1 :(a<0 && b>0)? 2: (a<0 && b<0)? 3: (a>0 && b<0)? 4: null);

        int result = a%2;
        String StringOut ="";
        String parity = "";
        String sign = "";

        if (a==0){
            StringOut = "ноль";
        }
        else {
            if (a<0) {
                sign = "отрицательное";
            }
            else{
                sign = "положительное";
            }

            parity = (result==0)? "четное":"нечетное";

            StringOut = sign + " " + parity + " " + "число";

        }
        System.out.println(StringOut);
    }
}
