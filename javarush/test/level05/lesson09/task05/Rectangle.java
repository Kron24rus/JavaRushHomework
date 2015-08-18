package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    protected int top;
    protected int left;
    protected int width;
    protected int height;
    //Напишите тут ваш код
    public Rectangle(int l, int t, int w, int h)
    {
        this.left = l;
        this.top = t;
        this.width = w;
        this.height = h;
    }
    public Rectangle(int l, int t, int h)
    {
        this.left = l;
        this.top = t;
        this.width = h;
        this.height = h;
    }
    public Rectangle(int l, int t)
    {
        this.left = l;
        this.top = t;
    }
    public Rectangle(Rectangle c)
    {
        this.left = c.left;
        this.top = c.top;
        this.width = c.width;
        this.height = c.height;
    }

}
