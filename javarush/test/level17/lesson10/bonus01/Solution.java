package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        //start here - начни тут
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
        SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if (args[0].equals("-c")) {
            Date date = sdfIn.parse(args[3]);
            if (args[2].equals("м")) {
                Person p = Person.createMale(args[1], date);
                allPeople.add(p);
                System.out.println(allPeople.indexOf(p));
            } else {
                Person p = Person.createFemale(args[1], date);
                allPeople.add(p);
                System.out.println(allPeople.indexOf(p));
            }
        } else if (args[0].equals("-u")) {
            Person s = allPeople.get(Integer.parseInt(args[1]));
            s.setBirthDay(sdfIn.parse(args[4]));
            s.setName(args[2]);
            if (args[3].equals("м")) s.setSex(Sex.MALE);
            else s.setSex(Sex.FEMALE);
        } else if (args[0].equals("-d")) {
            Person p = allPeople.get(Integer.parseInt(args[1]));
            p.setBirthDay(null);
            p.setName(null);
            p.setSex(null);
        } else if (args[0].equals("-i")) {
            Person s = allPeople.get(Integer.parseInt(args[1]));
            System.out.println(s.getName() + " " + ((s.getSex() == Sex.MALE) ? "м" : "ж") + " " + simpleDateFormat.format(s.getBirthDay()));
        }
    }
}
