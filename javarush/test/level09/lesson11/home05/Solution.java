package com.javarush.test.level09.lesson11.home05;

/* ������� � ��������� �����
�������� ���������, ������� ������ � ���������� ������ ������.
��������� ������ ������� �� ����� ��� ������:
1. ������ ������ �������� ������ ������� �����
2. ������ - ������ ��������� ����� � ����� ���������� �� �������� ������.
����� ��������� ��������.

������ �����:
���� ���� ����.
������ ������:
� � � � � �
� � � � � � .
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        char[] s = temp.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (isVowel(s[i])) {
                System.out.print(s[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i]) && s[i] != ' ') {
                System.out.print(s[i] + " ");
            }
        }

        //�������� ��� ��� ���
    }


    public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    //����� ���������, ������� �� �����
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //�������� ������ � ������ ������� - �� ��������� � �������� ������

        for (char d : vowels)   //���� ����� ������� �������
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
