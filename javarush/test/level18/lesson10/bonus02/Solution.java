package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String file = new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int maxId = 0;
        while (reader.ready()) {
            String temp = reader.readLine();
            if (!temp.isEmpty())
            {
                String myNumber = temp.substring(0, 8).replaceAll(" ", "");
                int id = Integer.parseInt(myNumber);
                if (id > maxId) maxId = id;
            }
        }
        reader.close();
        maxId++;
        int arguments = args.length;
        String result = "";
        String t = String.valueOf(maxId);
        if (t.length() < 8) {
            for (int i = t.length(); i < 8; i++) {
                t = t + " ";
            }
        }
        result = result + t;
        t = "";
        for (int i = 1; i < arguments - 2; i++) {
            t = t + args[i] + " ";
        }
        if (t.length() < 30) {
            for (int i = t.length(); i < 30; i++) {
                t = t + " ";
            }
        }
        if (t.length() > 30) {
            t = t.substring(0, 30);
        }
        result = result + t;
        t = args[arguments - 2];
        if (t.length() < 8) {
            for (int i = t.length(); i < 8; i++) {
                t = t + " ";
            }
        }
        if (t.length() > 8) {
            t = t.substring(0, 8);
        }
        result = result + t;
        t = args[arguments - 1];
        if (t.length() < 4) {
            for (int i = t.length(); i < 4; i++) {
                t = t + " ";
            }
        }
        if (t.length() > 4) {
            t = t.substring(0, 4);
        }
        result = result + t;
        FileWriter writer = new FileWriter(file, true);
        if (maxId == 1) writer.write(result);
        else writer.write("\n" + result);
        writer.close();
    }
}
