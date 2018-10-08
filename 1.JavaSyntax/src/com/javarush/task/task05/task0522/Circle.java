package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(int centerX)
    {
        this.x =  centerX;
        }


        public Circle(int centerX, int centerY)
    {
        this.x =  centerX;
        this.y = centerY;
    }
    public Circle(int centerX, int centerY, int radius)
    {
        this.x =  centerX;
        this.y = centerY;
        this.radius = radius;

    }

    public Circle(){}

    public Circle(boolean create){
        this(10,10);
    }
    public static void main(String[] args) {

    }
}