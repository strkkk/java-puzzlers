package com.company;

public class Puzzle14_Double {
    public static void main(String[] args) {
        System.out.println(
                Math.min(
                        Double.MIN_VALUE, 0.0d
                )
        );
    }
}

// 0x0.0000000000001P-1022 - Double.MIN_VALUE
// 0.0d
// Doesn't compile