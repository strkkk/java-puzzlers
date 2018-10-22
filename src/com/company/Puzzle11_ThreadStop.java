package com.company;

/**
 * Java 8
 */
public class Puzzle11_ThreadStop {
    public static class MyException extends Exception {

    }

    public static void main(String[] args) throws Exception {
        Thread.currentThread().stop(new MyException());
    }

    // Не скомпилируется
    // Поток остановится с исключением MyException
    // UnsupportedOperationException
    // InterruptedException
}
