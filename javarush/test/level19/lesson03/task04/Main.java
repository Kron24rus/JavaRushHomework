package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Александр on 19.08.2015.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(new File("out.txt"));
        Solution.PersonScannerAdapter ps = new Solution.PersonScannerAdapter(sc);
        Person mr = ps.read();
        System.out.println(mr.toString());
    }
}
