package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int mas[] = new int[20];
        mas[0] = Integer.parseInt(reader.readLine());
        minimum = maximum = mas[0];
        for (int i = 1; i < 20; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
            if (mas[i] > maximum) maximum = mas[i];
            if (mas[i] < minimum) minimum = mas[i];
        }
        //напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
