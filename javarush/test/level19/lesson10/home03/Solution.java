package com.javarush.test.level19.lesson10.home03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNext())
        {
            String[] mas = sc.nextLine().split(" ");
            Date date = new Date(mas[mas.length - 2] + "/" + mas[mas.length - 3] + "/" + mas[mas.length - 1]);
            String name = "";
            for (int i = 0; i < mas.length - 3; i++)
            {
                if (i < mas.length - 4) name = name + mas[i] + " ";
                else name = name + mas[i];
            }
            PEOPLE.add(new Person(name, date));
        }
        sc.close();
    }

}
