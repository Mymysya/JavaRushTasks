package com.javarush.task.task14.task1408;

//<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
public class RussianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }

}