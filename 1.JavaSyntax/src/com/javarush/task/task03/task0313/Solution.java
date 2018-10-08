package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/


class Stroka<T> {

    public Stroka(T obj) {
        val_ = obj;
    }

    public T get() { return val_; }

    public void set(T value) { val_ = value; }

    public void swap(Stroka<T> o) {
        T tmp = o.val_;
        o.val_ = val_;
        val_ = tmp;
    }
    private T val_ = null;
}

public class Solution {
    public static void main(String[] args) {
        String a ="Мама", b = "Мыла",  c = "Раму";

        Stroka<String> sw1 = new Stroka(a); // обертка первой строки
        Stroka<String> sw2 = new Stroka(b); // обертка второй  строки
        Stroka<String> sw3 = new Stroka(c); // обертка третьей строки


        // пошагово:
        showWrSwp(sw1, sw2, sw3 ); // показать
        sw1.swap(sw2); // обмен 1 - 2
        showWrSwp(sw1, sw2, sw3 ); // показать
        sw2.swap(sw3);// обмен 2 - 3

        showWrSwp(sw1, sw2, sw3 ); // показать
        sw1.swap(sw2); //обмен 1- 2
        showWrSwp(sw1, sw2, sw3 ); // показать
        sw2.swap(sw3);// обмен 2 - 3

        showWrSwp(sw1, sw2, sw3 ); // показать
        sw1.swap(sw2); // обмен 1 - 2
        showWrSwp(sw1, sw2, sw3 ); // показать



    }
    /* показать обертки */
    private static void showWrSwp(Stroka<String> sw1,Stroka<String> sw2,Stroka<String> sw3 ){
        System.out.print(sw1.get()+ sw2.get()+ sw3.get() );
        System.out.println("");
    }
}
