package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a > c)
        {
            if (a < b) System.out.println(a);
            else if (c > b)
            {
                System.out.println(c);
            }
            else System.out.println(b);
        }
        else if (a > b)
        {
            System.out.println(a);
        }
        else if (b > c)
        {
            System.out.println(c);
        }
        else System.out.println(b);

    }
}
