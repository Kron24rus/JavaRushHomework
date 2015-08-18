package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputStream = new BufferedReader(new FileReader(reader.readLine()));

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            String tmp2 = inputStream.readLine();
            if (tmp2 == null) break;
            int tmp = Integer.parseInt(tmp2);
            if (tmp % 2 == 0)
            {
                list.add(tmp);
            }
        }

        sort(list);
        // напишите тут ваш код
        for (Integer i : list) {
            System.out.println(i);
        }

        inputStream.close();
    }

    public static void sort(ArrayList<Integer> list) {
        int min, index;
        for (int i = 0; i < list.size(); i++) {
            min = list.get(i);
            index = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    index = j;
                }
            }
            list.set(index, list.get(i));
            list.set(i, min);
        }
    }
}
