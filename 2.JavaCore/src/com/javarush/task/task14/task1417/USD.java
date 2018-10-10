package com.javarush.task.task14.task1417;

//В классах Hrivna, Ruble и USD должен быть реализован публичный
// конструктор с одним параметром типа double, который устанавливает значение поля amount класса Money путем вызова конструктора класса родителя c тем же параметром.

public class USD extends Money{

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
