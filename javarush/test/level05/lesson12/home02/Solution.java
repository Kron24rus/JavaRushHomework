package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1 = new Man("CJ", 23, "Groove Street");
        Man man2 = new Man("Big Smoke", 41, "Groove Street");
        Woman woman1 = new Woman("Izi", 21, "Groove Street");
        Woman woman2 = new Woman("Girl", 15, "Groove Street");
        // Выведи их на экран тут
        System.out.println(man1 + "\n" + man2 + "\n" + woman1 + "\n" + woman2);
    }

    // Напиши тут свои классы
    public static class Man
    {
        protected String name;
        protected int age;
        protected String address;
        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman
    {
        protected String name;
        protected int age;
        protected String address;
        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
