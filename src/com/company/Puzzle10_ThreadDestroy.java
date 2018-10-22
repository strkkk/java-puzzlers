package com.company;

/**
 * Puzzler for Java 8
 */
public class Puzzle10_ThreadDestroy {

    public static void main(String[] args) {
        Thread.currentThread().destroy();
    }

    // Все ок, текущий поток завершится
    // Не скомпилируется
    // NoSuchMethodError
    // InterruptedException
}
