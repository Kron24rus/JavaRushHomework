package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(breader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(breader.readLine()));
        breader.close();

        String line = "";

        while (reader.ready()) {
            line = reader.readLine();
            String[] mas = line.split(" ");
            for (String t : mas) {
                try
                {
                    int data = Integer.parseInt(t);
                    writer.write(data + " ");
                }
                catch (NumberFormatException e)
                {

                }
            }
        }
        reader.close();
        writer.close();
    }
}
