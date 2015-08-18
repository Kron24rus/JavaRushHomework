package com.javarush.test.level18.lesson03.task01;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int max = Integer.MIN_VALUE;
        int data;

        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0)
        {
            data = inputStream.read();
            if (max < data)
            {
                max = data;
            }
        }

        inputStream.close();

        System.out.println(max);
    }
}
