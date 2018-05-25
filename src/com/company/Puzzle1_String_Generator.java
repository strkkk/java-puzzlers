package com.company;

public class Puzzle1_String_Generator {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            sb.append((char) i);
        }
        String raw = sb.toString();
        String aligned = raw.toUpperCase().toLowerCase();
        System.out.println(Integer.compare(raw.length(), aligned.length()));
    }

//    -1 (aligned длиннее)
//    0 (одинаковы)
//    1 (raw длиннее)
}
