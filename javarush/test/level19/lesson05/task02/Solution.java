package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(breader.readLine()));
        breader.close();
        int count = 0;

        while (reader.ready()) {
            String s = reader.readLine();
            s = s.replaceAll("\\p{Punct}", " ");
            String[] m = s.split(" ");
            for (String x : m) {
                if (x.equals("world")) count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}
