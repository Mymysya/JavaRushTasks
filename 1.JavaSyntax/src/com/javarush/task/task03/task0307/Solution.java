package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {

        int i;

        Zerg zergs[] = new Zerg[5];
        for (i = 0; i < 5; i++){
            zergs[i] = new Zerg();
            zergs[i].name = "zerg" + i;
        }

        Protoss protosses[] = new Protoss[3];
        for (i = 0; i < 3; i++){
            protosses[i] = new Protoss();
            protosses[i].name = "protoss" + i;
        }

        Terran terrans[] = new Terran[4];
        for (i = 0; i < 4; i++){
            terrans[i] = new Terran();
            terrans[i].name = "Terran" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
