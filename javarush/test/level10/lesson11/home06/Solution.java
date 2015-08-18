package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String secondname;
        boolean sex;
        int age;
        int growth;
        int weight;

        public Human(String name) {
            this.name = name;
        }
        public Human(String name, String secondname) {
            this.name = name;
            this.secondname = secondname;
        }
        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human(String name, int weight, int growth) {
            this.name = name;
            this.weight = weight;
            this.growth = growth;
        }
        public Human(String name, String secondname, int age) {
            this.name = name;
            this.secondname = secondname;
            this.age = age;
        }
        public Human(String name, String secondname, int age, int growth) {
            this.name = name;
            this.secondname = secondname;
            this.age = age;
            this.growth = growth;
        }
        public Human(String name, String secondname, int age, int growth, int weight) {
            this.name = name;
            this.secondname = secondname;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }
        public Human(String name, String secondname, boolean sex, int age) {
            this.name = name;
            this.secondname = secondname;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, String secondname, boolean sex, int age, int weight) {
            this.name = name;
            this.secondname = secondname;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
