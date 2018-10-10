package com.javarush.task.task14.task1421;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){
        return;
    }

    public static Singleton getInstance(){

        return Singleton.instance;
    }
}
