package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puzzle2_Cracking_code_interview_1 {

    public static void main(String[] args) {
        List<String> humans = new ArrayList<>();
        humans.add("Man");
        humans.add("Woman");
        humans.add("Alien");
        for (String human : humans) {
            if ("Man".equals(human)) {
                humans.remove("Alien");
            }
            System.out.println(human);
        }
    }

//    Man, Woman, Alien
//    Man, Woman, null
//    ConcurrentModificationException
//    Man, ConcurrentModificationException

}
