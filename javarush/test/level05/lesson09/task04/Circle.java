package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius  width, color
*/

public class Circle
{
    //Напишите тут ваш код
    protected int centerX;
    protected int centerY;
    protected int radius;
    protected int width;
    protected String color;
    //Напишите тут ваш код
    public Circle(int x, int y, int r)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
    }
    public Circle(int x, int y, int r, int w)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
    }
    public Circle(int x, int y, int r, int w, String color)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
        this.color = color;
    }

}
