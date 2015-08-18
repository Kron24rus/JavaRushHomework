package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    protected String name = null;
    protected int weight = 2;
    protected int age = 2;
    protected String color;
    protected String address;

    public Cat(String name)
    {
        this.name = name;
    }
    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(int age, String name)
    {
        this.name = name;
        this.age = age;
    }
    public Cat(String color, int weight)
    {
        this.color = color;
        this.weight = weight;
    }
    public Cat(String color, int weight, String address)
    {
        this.color = color;
        this.weight = weight;
        this.address = address;
    }
    //Напишите тут ваш код

}
