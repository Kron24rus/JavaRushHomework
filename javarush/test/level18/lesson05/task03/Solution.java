package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());


            if (inputStream.available() % 2 == 0) {
                byte[] buff = new byte[inputStream.available() / 2];
                inputStream.read(buff);
                outputStream.write(buff);
                inputStream.read(buff);
                outputStream1.write(buff);
            }
            else {
                byte[] buff = new byte[inputStream.available() / 2];
                int count = inputStream.read(buff);
                outputStream1.write(buff);
                byte[] buff2 = new byte[count + 1];
                inputStream.read(buff2);
                outputStream.write(buff2);
            }


        reader.close();
        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
