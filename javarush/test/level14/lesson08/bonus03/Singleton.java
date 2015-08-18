package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Александр on 18.07.2015.
 */
public class Singleton
{
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance()
    {
        return singleton;
    }
}
