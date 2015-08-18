package com.javarush.test.level16.lesson13.bonus03;

/**
 * Created by Александр on 01.08.2015.
 */
public class exceptionTest
{
    //public static

    public static void main(String[] args) {

        Thread t = new Thread(new adminThread());
        t.setUncaughtExceptionHandler(new MyUncaught());

        t.start();
    }

    static class adminThread extends Thread {

        public adminThread() {

        }

        @Override
        public void run()
        {
            throw new RuntimeException();
        }
    }

    public static class MyUncaught implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e)
        {
            System.out.println(t.getName() + " throws exception: " + e);
        }
    }
}
