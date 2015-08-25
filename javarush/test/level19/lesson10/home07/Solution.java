package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(args[0]));
        PrintWriter pw = new PrintWriter(new File(args[1]));
        int i = 0;
        while (sc.hasNext())
        {
            String word = sc.next();
            if (word.length() > 6)
            {
                if (i != 0) pw.print("," + word);
                else pw.print(word);
                i++;
            }
        }
        sc.close();
        pw.close();
    }
}
