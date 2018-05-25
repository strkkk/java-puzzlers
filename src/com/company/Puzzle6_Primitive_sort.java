package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Puzzle6_Primitive_sort {

    public static void main(String[] args) {
        Map<Double, String> nums = new TreeMap<>();
        nums.put((double) Character.MIN_VALUE, "char");
        nums.put(Double.MIN_VALUE, "double");
        nums.put((double) Short.MIN_VALUE, "short");
        nums.values().forEach(System.out::println);
    }

//       short, char, double
//       double, short, char
//       double, char, short
//       Ошибка в рантайме
}
