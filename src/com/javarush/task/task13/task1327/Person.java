package com.javarush.task.task13.task1327;

public class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person second){
        /*
        2. В классе Person должен быть реализован метод pull c одним параметром типа Person.
        3. Метод pull в классе Person должен выводить на экран фразу типа ' за '. Например: Бабка за Дедку.
         */

        System.out.println(name +" за "+second.namePadezh);

    }
}
