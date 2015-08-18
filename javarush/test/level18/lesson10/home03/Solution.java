package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFile = reader.readLine();
        String outFile1 = reader.readLine();
        String outFile2 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(inFile);
        FileInputStream inputStream1 = new FileInputStream(outFile1);
        FileInputStream inputStream2 = new FileInputStream(outFile2);

        while (inputStream1.available() > 0) {
            int data = inputStream1.read();
            outputStream.write(data);
        }

        inputStream1.close();

        while (inputStream2.available() > 0) {
            int data = inputStream2.read();
            outputStream.write(data);
        }

        inputStream2.close();
        reader.close();
        outputStream.close();
    }
}
