package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human GrandVasya = new Human("Vasya,", 68, true);
        Human GrandMasha = new Human("Masha", 66, false);
        Human GrandMisha = new Human("Misha", 70, true);
        Human GrandDasha = new Human("Dasa", 67, false);
        Human Petr = new Human("Petr", 35, true);
        Human Lera = new Human("Lera", 33, false);
        Human ChildHuan = new Human("Huan", 5, true);
        Human ChildPedro = new Human("Pedro", 3, true);
        Human ChildIsrail = new Human("Israil", 3, true);
        GrandMasha.addChild(Petr);
        GrandVasya.addChild(Petr);
        GrandMisha.addChild(Lera);
        GrandDasha.addChild(Lera);
        Petr.addChild(ChildHuan);
        Petr.addChild(ChildIsrail);
        Petr.addChild(ChildPedro);
        Lera.addChild(ChildHuan);
        Lera.addChild(ChildIsrail);
        Lera.addChild(ChildPedro);
        System.out.println(GrandVasya.toString());
        System.out.println(GrandMasha.toString());
        System.out.println(GrandMisha.toString());
        System.out.println(GrandDasha.toString());
        System.out.println(Petr.toString());
        System.out.println(Lera.toString());
        System.out.println(ChildHuan.toString());
        System.out.println(ChildPedro.toString());
        System.out.println(ChildIsrail.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        //напишите тут ваш код
        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public void addChild(Human child) {
            children.add(child);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
