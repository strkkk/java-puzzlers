package com.company;

public class Puzzle3_What_the_Float {
    public static void main(String[] args) {

        Float f1 = Float.valueOf(0x12);
        float f2 = 0x12F;
        System.out.println(Float.compare(f1, f2));

    }

//    1 (f1 больше)
//    0 (равны)
//    -1 (f2 больше)
//    Зависит от чего-то
}
