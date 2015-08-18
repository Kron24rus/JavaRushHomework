package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Михеев", "Александр");
        map.put("Петров", "Петр");
        map.put("Александров", "Андрей");
        map.put("Мешкорудный", "Влад");
        map.put("Нисневич", "Арсений");
        map.put("Куркин", "Иван");
        map.put("Иванов", "Алексей");
        map.put("Жданов", "Кирилл");
        map.put("Вычужанин", "Павел");
        map.put("Саакашвили", "Михаил");
        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        //напишите тут ваш код
        for (String s : map.values()) {
            if (s.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (String s : map.keySet()) {
            if (s.equals(familiya)) count++;
        }
        //напишите тут ваш код
        return count;
    }
}
