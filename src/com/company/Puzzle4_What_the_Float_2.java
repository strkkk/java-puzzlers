package com.company;

public class Puzzle4_What_the_Float_2 {
    public static void main(String[] args) {

        Float f1 = Float.valueOf(012);
        float f2 = 012F;
        System.out.println(Float.compare(f1, f2));

    }

//    1 (f1 больше)
//    0 (равны)
//    -1 (f2 больше)
//    Зависит от чего-то
}
