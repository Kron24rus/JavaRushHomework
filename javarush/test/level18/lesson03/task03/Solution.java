package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int m[] = new int[256];
        int max = 0;

        while (inputStream.available() > 0) {
            int index = inputStream.read() + 128;
            m[index]++;
            if (m[index] > max) max = m[index];
        }

        for (int i = 0; i < m.length; i++) {
            if (m[i] == max) {
                System.out.println(i - 128);
            }
        }
    }
}
