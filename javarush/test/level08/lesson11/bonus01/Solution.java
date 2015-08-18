package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateStart = reader.readLine();
        String dateParse = dateStart + " 2 2010";
        Date date = new Date(Date.parse(dateParse));
        System.out.print(dateStart + " is " + (date.getMonth() + 1) + " month");
        //напишите тут ваш код
    }

}
