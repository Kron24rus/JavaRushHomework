package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {
    //добавьте переменные класса тут
    public String name;
    public int age;

    //добавьте геттеры и сеттеры тут
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int newAge)
    {
        this.age = newAge;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
}
