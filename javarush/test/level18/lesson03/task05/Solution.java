package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int m[] = new int[256];
        int max = 0;

        while (inputStream.available() > 0) {
            int index = inputStream.read() + 128;
            m[index]++;
        }

        for (int i = 0; i < m.length; i++) {
            if (m[i] != 0) {
                System.out.println(i - 128);
            }
        }
    }
}
