package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        OutputStream outputStream = new FileOutputStream(file);
        ArrayList<String> list = new ArrayList<String>();
        String temp;

        while (true) {
            temp = reader.readLine();
            list.add(temp);
            if (temp.equals("exit")) break;
        }

        for (String s : list) {
            outputStream.write(s.getBytes());
            outputStream.write("\n".getBytes());
        }
        outputStream.close();
    }
}
