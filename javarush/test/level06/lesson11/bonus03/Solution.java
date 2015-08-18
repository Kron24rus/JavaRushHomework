package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int m[] = new int[5];
        for (int i = 0; i < 5; i ++)
        {
            m[i] = Integer.parseInt(reader.readLine());
        }
        m = SortArr(m);
        for (int i = 0; i < 5; i ++)
        {
            System.out.println(m[i]);
        }
    }

    static int[] SortArr(int[] arr)
    {
        int n = 5, j = 5, max = arr[0], tmp = 0;
        while (n > 0)
        {
            j = 0; max = arr[0];
            while (j < n)
            {
                if (max < arr[j])
                {
                    max = arr[j];
                    tmp = j;
                }
                j++;
            }
            arr[tmp] = arr[n - 1];
            arr[n - 1] = max;
            n--;
            tmp = 0;
        }
        return arr;
    }

}
