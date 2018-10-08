package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while(true) {
            String s = r.readLine();
            if(s.equals("сумма")) { break;
            } else { int x = Integer.parseInt(s);
                sum = sum+x;
            }
        }
        System.out.println(sum);
    }

}
