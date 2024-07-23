package Map;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.remove(1);

        if (!map.containsKey(4)) {
            map.put(4, "dd");
        }
        map.putIfAbsent(4, "bb");

        System.out.println(map);

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (Integer e : map.keySet()) {
            System.out.print(e);
        }
        System.out.println();

        for (String e : map.values()) {
            System.out.print(e);
        }
        System.out.println();

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();

        Map<Integer, String> map1 = new TreeMap<>(); // store element in sorted order of key
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        map1.put(4, "d");

        if (!map1.containsKey(4)) {
            map1.put(4, "dd");
        }
        map1.putIfAbsent(4, "bb");

        System.out.println(map1);

        for (Map.Entry<Integer, String> e : map1.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (Integer e : map1.keySet()) {
            System.out.print(e);
        }
        System.out.println();

        for (String e : map1.values()) {
            System.out.print(e);
        }
        System.out.println();

        System.out.println(map1.size());
        System.out.println(map1.isEmpty());
        map1.clear();
    }

}
