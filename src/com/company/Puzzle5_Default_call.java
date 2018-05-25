package com.company;

public class Puzzle5_Default_call {

}

interface Polite {
    default void hello() {
        System.out.println("default hello");
    }
}

class Parent {
    private void hello() {
        System.out.println("private hello");
    }
}

class Child extends Parent implements Polite {
    public static void main(String[] args) {
        new Child().hello();
    }
}

//   do private
//   do default
//   Ошибка в рантайме
//   Не скомпилируется

// Ссылка https://bugs.java.com/view_bug.do?bug_id=8021581

