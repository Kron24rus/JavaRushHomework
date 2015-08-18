package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String file = new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int searchId = Integer.parseInt(args[1]);
        int searchedLine = 0;
        int lines = 0;

        while (reader.ready()) {
            reader.readLine();
            lines++;
        }

        ArrayList<String> buf = new ArrayList<String>();
        reader.close();
        reader = new BufferedReader(new FileReader(file));

        for (int i = 0; i < lines; i++) {
            String temp = reader.readLine();
            buf.add(temp);
            if (!temp.isEmpty())
            {
                String myNumber = temp.substring(0, 8).replaceAll(" ", "");
                int id = Integer.parseInt(myNumber);
                if (id == searchId) searchedLine = i;
            }
        }

        reader.close();

        if (args[0].equals("-u")) {
            String result = adaptSpaces(args);
            buf.set(searchedLine, result);
        }
        if (args[0].equals("-d")) {
            buf.set(searchedLine, "");
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < buf.size(); i++) {
            if (i < buf.size() - 1) writer.write(buf.get(i) + "\n");
            else writer.write(buf.get(i));
        }

        writer.close();
    }

    public static String adaptSpaces(String[] mas) {
        String result = "";
        String t = mas[1];
        if (t.length() < 8) {
            for (int i = t.length(); i < 8; i++) {
                t = t + " ";
            }
        }
        result = result + t;
        t = "";

        t = mas[2];
        if (t.length() < 30) {
            for (int i = t.length(); i < 30; i++) {
                t = t + " ";
            }
        }
        if (t.length() > 30) {
            t = t.substring(0, 30);
        }
        result = result + t;

        t = mas[3];
        if (t.length() < 8) {
            for (int i = t.length(); i < 8; i++) {
                t = t + " ";
            }
        }
        if (t.length() > 8) {
            t = t.substring(0, 8);
        }
        result = result + t;

        t = mas[4];
        if (t.length() < 4) {
            for (int i = t.length(); i < 4; i++) {
                t = t + " ";
            }
        }
        if (t.length() > 4) {
            t = t.substring(0, 4);
        }
        result = result + t;

        return result;
    }
}
