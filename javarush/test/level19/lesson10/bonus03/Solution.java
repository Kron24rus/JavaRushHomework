package com.javarush.test.level19.lesson10.bonus03;

/* Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span>
Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги
Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tag = args[0];
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        byte[] buf = new byte[inputStream.available()];

        inputStream.read(buf);

        inputStream.close();

        String temp = new String(buf);

        ArrayList<Integer> positions = new ArrayList<>();
        ArrayList<String> tags = new ArrayList<>();
        Map<Integer, String> map = new TreeMap<>();

        int open = 0, close = 0;

        for (int i = 1; i < temp.length() - tag.length(); i++) {
            if (temp.substring(i, i + tag.length()).equals(tag)) {
                if (temp.charAt(i - 1) == '/' && temp.charAt(i - 2) == '<') {
                    close++;
                    positions.get(positions.size() - 1);
                    String out = temp.substring(positions.get(positions.size() - 1) - 1, i + tag.length() + 1);
                    map.put(positions.get(positions.size() - 1), out.replaceAll("[\\n\\r]", ""));
                    positions.remove(positions.get(positions.size() - 1));
                    tags.add(out);
                }
                else if (temp.charAt(i - 1) == '<') {
                    open++;
                    positions.add(i);
                }
            }
        }

        for (Map.Entry s : map.entrySet()) {
            System.out.println(s.getValue());
        }
    }
}
