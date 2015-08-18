package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<Integer, String> map = new HashMap<Integer, String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String part;
        String[] tempPart = null;
        String tempPeace;
        String nameOut = "";

        while (!(part = reader.readLine()).equals("end")) {
            tempPart = part.split("\\.");
            String t = tempPart[tempPart.length - 1];
            tempPeace = t.substring(4, t.length());
            map.put(Integer.parseInt(tempPeace), part);
        }

        reader.close();

        for (int i = 0; i < tempPart.length - 1; i++) {
            if (i < tempPart.length - 2) nameOut = nameOut + tempPart[i] + '.';
            else nameOut = nameOut + tempPart[i];
        }

        byte[] buf;

        FileInputStream inputStream = null;
        FileOutputStream outputStream = new FileOutputStream(nameOut);

        for (Map.Entry<Integer, String> s : map.entrySet()) {
            inputStream = new FileInputStream(s.getValue());
            buf = new byte[inputStream.available()];
            inputStream.read(buf);
            outputStream.write(buf);
            inputStream.close();
          //  System.out.println(s.getKey() + " " + s.getValue());
        }

        inputStream.close();
        outputStream.close();
    }
}
