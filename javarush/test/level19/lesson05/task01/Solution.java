package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(breader.readLine());
        FileWriter writer = new FileWriter(breader.readLine());
        breader.close();

        int i = 1;
        while (reader.ready()) {
            int data = reader.read();
            if (i % 2 == 0) writer.write(data);
            i++;
        }
        reader.close();
        writer.close();
    }
}
