package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String key = args[0];

        if (key.equals("-e")) {
            FileInputStream inputStream = new FileInputStream(args[1]);
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[2]));
            while (inputStream.available() > 0)
            {
                int data = inputStream.read();
                data = data * 100500;
                writer.write(data + " ");
            }
            inputStream.close();
            writer.close();
        }
        if (key.equals("-d")) {
            BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            FileOutputStream outputStream = new FileOutputStream(args[2]);
            String data = reader.readLine();
            String[] m = data.split(" ");
            for (int i = 0; i < m.length; i++) {
                outputStream.write(Integer.parseInt(m[i]) / 100500);
            }
        }
    }
}
