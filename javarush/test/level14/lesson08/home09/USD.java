package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Александр on 18.07.2015.
 */
public class USD extends Money
{
    public USD (double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
