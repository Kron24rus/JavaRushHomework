package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(int a) {

    }
    public Solution(Integer a) {

    }
    public Solution(short a) {

    }

    protected Solution(String s) {

    }
    protected Solution(Long b) {

    }
    protected Solution(Double d) {

    }

    Solution(Float f) {

    }
    Solution(char t) {

    }
    Solution(Byte d) {

    }
    
    private Solution (Number s) {

    }

    private Solution (Exception e) {

    }

    private Solution (Object o) {

    }
}

