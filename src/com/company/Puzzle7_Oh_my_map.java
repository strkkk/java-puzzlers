package com.company;

import java.util.HashMap;
import java.util.Map;

public class Puzzle7_Oh_my_map {

    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<>();
        map.put(map, "my map");
        String result = map.get(map);
        System.out.println(result);
    }

//    Зависит от чего-то
//    my map
//    null
//    Ошибка в рантайме (Stackoverflow)

}
