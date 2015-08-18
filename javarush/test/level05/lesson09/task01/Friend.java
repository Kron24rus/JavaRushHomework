package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    int age;
    String gender;
    public Friend(String Name)
    {
        this.name = Name;
    }
    public Friend(String Name, int age)
    {
        this.name = Name;
        this.age = age;
    }
    public Friend(String Name, int age, String Gender)
    {
        this.name = Name;
        this.age = age;
        this.gender = Gender;
    }
    //Напишите тут ваш код

}