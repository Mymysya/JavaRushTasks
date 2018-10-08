package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> List = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            List.add(reader.readLine());
        }

        List.remove(2);
        int leath = List.size() - 1;

        for (; leath >= 0; leath--) {
            System.out.println(List.get(leath));
        }
    }
}

