package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStreamTemp = new FileInputStream(file1);
        FileInputStream inputStream = new FileInputStream(file2);

        byte[] buff = new byte[inputStreamTemp.available()];
        inputStreamTemp.read(buff);
        inputStreamTemp.close();

        FileOutputStream outputStream = new FileOutputStream(file1);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        outputStream.write(buff);

        inputStream.close();
        outputStream.close();
        reader.close();
    }
}
