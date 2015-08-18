package com.javarush.test.level08.lesson11.home09;

import java.util.Date;/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
     //   System.out.print(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date)
    {
        Date start = new Date();
        start.setMonth(0);
        String[] s = date.split(" ");
        String newDate = s[2] + " " + s[0] + " " + s[1];
        Date date1 = new Date(Date.parse(newDate));
        date1.setYear(Integer.parseInt(s[2]));
        start.setYear(Integer.parseInt(s[2]));
        start.setDate(0);
        start.setMinutes(0);
        start.setHours(0);
        start.setSeconds(0);
      //  System.out.println(date1.getDate() + " " + date1.getMonth() + " " + date1.getYear() + " " + date1.getHours() + " " + date1.getMinutes() + " " + date1.getSeconds());
     //   System.out.println(start.getDate() + " " + start.getMonth() + " " + start.getYear() + " " + start.getHours() + " " + start.getMinutes() + " " + start.getSeconds());
    //    System.out.println((date1.getTime() - start.getTime()));
        return (((date1.getTime() - start.getTime())/86400000 + 1) % 2 == 0) ? false : true;
    }
}
