package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            InputStream in = new FileInputStream("test");
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try
        {
            throw new NullPointerException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new NoSuchElementException());
        exceptions.add(new FormatterClosedException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new TimeoutException());
        exceptions.add(new BufferOverflowException());
        //Add your code here

    }
}
