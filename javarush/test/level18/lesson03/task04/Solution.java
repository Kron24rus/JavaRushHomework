package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int m[] = new int[256];
        int max = Integer.MAX_VALUE;

        while (inputStream.available() > 0) {
            int index = inputStream.read() + 128;
            m[index]++;
            if (m[index] < max) max = m[index];
        }

        for (int i = 0; i < m.length; i++) {
            if (m[i] == max) {
                System.out.println(i - 128);
            }
        }

        inputStream.close();
    }
}
