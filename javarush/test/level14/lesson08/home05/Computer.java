package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Александр on 18.07.2015.
 */
public class Computer
{
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer()
    {
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
