package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        int i = 0;
        while (i < M) {
            list.add(list.get(0));
            list.remove(0);
            i++;
        }
        //напишите тут ваш код
        for (int j = 0; j < N; j++) {
            System.out.println(list.get(j));
        }
    }
}
