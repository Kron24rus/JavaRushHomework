package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human GrandVasya = new Human("Vasya,", 68, true, null, null);
        Human GrandMasha = new Human("Masha", 66, false, null, null);
        Human GrandMisha = new Human("Misha", 70, true, null, null);
        Human GrandDasha = new Human("Dasa", 67, false, null, null);
        Human Petr = new Human("Petr", 35, true, GrandVasya, GrandMasha);
        Human Lera = new Human("Lera", 33, false, GrandMisha, GrandDasha);
        Human ChildHuan = new Human("Huan", 5,true, Petr, Lera);
        Human ChildPedro = new Human("Pedro", 3, true, Petr, Lera);
        Human ChildIsrail = new Human("Israil", 3, true, Petr, Lera);
        System.out.println(GrandVasya.toString());
        System.out.println(GrandMasha.toString());
        System.out.println(GrandMisha.toString());
        System.out.println(GrandDasha.toString());
        System.out.println(Petr.toString());
        System.out.println(Lera.toString());
        System.out.println(ChildHuan.toString());
        System.out.println(ChildPedro.toString());
        System.out.println(ChildIsrail.toString());
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        //напишите тут ваш код

        public Human(String name, int age, boolean sex, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
