package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum, n, k;
        n = Integer.parseInt(reader.readLine());
        maximum = Integer.parseInt(reader.readLine());
        //напишите здесь ваш код
        for (int i = 1; i < n; i ++)
        {
            k = Integer.parseInt(reader.readLine());
            maximum = max(maximum, k);
        }



        System.out.println(maximum);
    }
    public static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
}
