package com.javarush.test.level19.lesson10.bonus02;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Created by Александр on 25.08.2015.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Writer e;
        OutputStreamWriter w;
        FileConsoleWriter writer = new FileConsoleWriter("out.txt");
        String s = "test char buf";
        char[] buf = s.toCharArray();
        int l = 23;
        writer.write(buf);
        System.out.println("");
        writer.write(buf, 4, 8);
        System.out.println("");
        writer.write(l);
        System.out.println("");
        writer.write("mam mila ramu");
        System.out.println("");
        writer.write("mama mila rau 3 dnia", 5, 8);
        writer.close();
    }
}
