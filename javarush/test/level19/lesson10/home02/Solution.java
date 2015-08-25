package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException
    {
        Map<String, Double> salary = new TreeMap<String, Double>();

        String name;
        double value;
        double maxValue = 0;
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNext()) {
            name = sc.next();
            value = Double.parseDouble(sc.next());
            if (!salary.containsKey(name)) {
                salary.put(name, value);
            } else {
                salary.put(name, salary.get(name) + value);
            }
            if (salary.get(name) > maxValue) maxValue = salary.get(name);
        }
        sc.close();

        for (Map.Entry<String, Double> m : salary.entrySet()) {
            if (m.getValue() == maxValue) System.out.println(m.getKey());
        }
    }
}
