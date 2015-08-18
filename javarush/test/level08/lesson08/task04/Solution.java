package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Lingo", new Date("MAY 1 1982"));
        map.put("Star", new Date("JUNE 2 1980"));
        map.put("Vasya", new Date("JULY 3 1988"));
        map.put("Petrov", new Date("AUGUST 2 2122"));
        map.put("Vodkin", new Date("MAY 2 1988"));
        map.put("Ambrasura", new Date("MAY 2 1988"));
        map.put("Lenin", new Date("MAY 2 1988"));
        map.put("Ktoto", new Date("MAY 2 1988"));
        map.put("Kokoko", new Date("MAY 2 1988"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            switch (iterator.next().getValue().getMonth()) {
                case 5:
                    iterator.remove();
                    break;
                case 6:
                    iterator.remove();
                    break;
                case 7:
                    iterator.remove();
                    break;
            }

        }
    }
}
