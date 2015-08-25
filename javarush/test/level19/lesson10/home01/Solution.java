package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
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
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNext()) {
            name = sc.next();
            value = Double.parseDouble(sc.next());
            if (!salary.containsKey(name)) {
                salary.put(name, value);
            } else {
                salary.put(name, salary.get(name) + value);
            }

        }
        sc.close();

        for (Map.Entry<String, Double> m : salary.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
