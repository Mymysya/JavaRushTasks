package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.


Требования:
1. Класс StringObject должен реализовывать интерфейс SimpleObject.
2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
3. В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
4. Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();

        String getInstance(String x);
    }

    abstract class  StringObject implements SimpleObject
    {
        @Override
        public String getInstance(String x) {
            return x;
        }
    }
}