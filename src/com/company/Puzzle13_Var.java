package com.company;

public class Puzzle13_Var {
    public static void executor(Object parameter) {
        // parameter.method2(); // should be uncommented    // line 1
    }

    public static void main(String[] args) {
        var value = new Object(){                           // line 2
            void method1() {
                System.out.println("Hello from method 1");
            }
            void method2() {
                System.out.println("Hello from method 2");
            }
        };

        value.method1();                                    // line 3
        executor(value);                                    // line 4
    }
}

// Hello from method 1, Hello from method 2
// Compile error at line 1
// Compile error at line 2
// Compile error at line 3
// Compile error at line 4