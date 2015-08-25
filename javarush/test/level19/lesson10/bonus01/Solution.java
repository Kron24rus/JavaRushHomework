package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
[Файл 1]
строка1
строка2
строка3

[Файл 2]
строка1
строка3
строка4

[Результат - список lines]
SAME строка1
REMOVED строка2
SAME строка3
ADDED строка4
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc1 = new Scanner(new File(reader.readLine()));
        Scanner sc2 = new Scanner(new File(reader.readLine()));
        reader.close();

        ArrayList<String> file1 = new ArrayList<>();
        ArrayList<String> file2 = new ArrayList<>();

        while (sc1.hasNext()) {
            file1.add(sc1.nextLine());
        }
        sc1.close();

        while (sc2.hasNext()) {
            file2.add(sc2.nextLine());
        }
        sc2.close();

        searchChanges(file1, file2);
    }

    public static void searchChanges(ArrayList<String> set1, ArrayList<String> set2) {
        int i = 0, j = 0;

        while (true){
        //    System.out.println(i + "=" + j);
            if (i == set1.size() && j == set2.size() - 1) {
                lines.add(new LineItem(Type.ADDED, set2.get(j)));
                j++;
            }
            if (i == set1.size() || j == set2.size()) break;

            if (set1.get(i).equals(set2.get(j)))
            {
                lines.add(new LineItem(Type.SAME, set1.get(i)));
                i++;
                j++;
            } else if (j == set1.size() - 1 && i < set1.size() - 1) {
                lines.add(new LineItem(Type.REMOVED, set1.get(i)));
                i++;
            } else if (set1.get(i).equals(set2.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, set2.get(j)));
                j++;
            } else if (!set1.get(i).equals(set2.get(j + 1))) {
                lines.add(new LineItem(Type.REMOVED, set1.get(i)));
                i++;
            }
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
