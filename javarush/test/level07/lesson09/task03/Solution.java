package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] data = {"мама","мыла","раму"};
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i ++) {
            list.add(data[i]);
        }
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
