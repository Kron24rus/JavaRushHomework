package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(args[0]));
        PrintWriter pw = new PrintWriter(new File(args[1]));

        while (sc.hasNext()) {
            String temp = sc.next();
            String[] mas = temp.split("");
            for (String s : mas) {
                if (s.matches("\\d")) {
                    pw.write(temp + " ");
                    break;
                }
            }
        }
        sc.close();
        pw.close();
    }
}
