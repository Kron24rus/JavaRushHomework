package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Александр on 21.07.2015.
 */
public class SubSolution extends Solution
{
    SubSolution(Float f)
    {
        super(f);
    }

    SubSolution(char t)
    {
        super(t);
    }

    SubSolution(Byte d)
    {
        super(d);
    }

    public SubSolution(int a)
    {
        super(a);

    }

    public SubSolution(Integer a)
    {
        super(a);
    }

    public SubSolution(short a)
    {
        super(a);
    }

    protected SubSolution(String s)
    {
        super(s);
    }

    protected SubSolution(Long b)
    {
        super(b);
    }

    protected SubSolution(Double d)
    {
        super(d);
    }

    private SubSolution(Object a) {
        super((Integer)a);
    }

    private SubSolution(Number a) {
        super((Byte)a);
    }

    private SubSolution(Short a) {
        super((Short)a);
    }
}
