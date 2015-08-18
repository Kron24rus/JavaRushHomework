package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String temp = reader.readLine();
            if (temp.equals("exit")) break;
            new ReadThread(temp).start();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {

        private String fileName;
        private FileInputStream inputStream;
        private int[] temp = new int[256];
        private int max = 0;
        private int index = -1;

        public ReadThread(String fileName) throws IOException
        {
            //implement constructor body
            this.fileName = fileName;
            inputStream = new FileInputStream(fileName);
        }

        @Override
        public void run()
        {
            try
            {
                while (inputStream.available() > 0) {
                    int t = inputStream.read();
                    temp[t]++;
                    if (temp[t] > max) {
                        index = t;
                        max = temp[t];
                    }
                }
                inputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            resultMap.put(fileName, index);
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
