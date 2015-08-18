package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        map.put("Куркин", "Андрей");
        map.put("Иванов", "Алексей");
        map.put("Жданов", "Кирилл");
        map.put("Вычужанин", "Павел");
        map.put("Саакашвили", "Михаил");
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> cpy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            cpy.remove(s.getKey());
            if (cpy.containsValue(s.getValue())) {
                removeItemFromMapByValue(map, s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
