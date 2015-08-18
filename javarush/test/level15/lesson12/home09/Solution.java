package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        String[] mas = URL.split("[&?]");
        ArrayList<Object> o = new ArrayList<Object>();
        for (String s : mas) {
            if (!s.equals(mas[0]))
            {
                String[] buf = s.split("=");
                if (buf[0].equals("obj")) {
                    try
                    {
                        o.add(Double.parseDouble(buf[1]));
                    } catch (Exception e) {
                        o.add(buf[1]);
                    }
                }
                System.out.print(buf[0] + " ");
            }
        }
        System.out.println();
        for (Object to : o) {
            if (to instanceof Double) {
                alert((Double)to);
            } else alert((String)to);
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
