package data_structures.hash_map;

import java.util.Map;

/**
 * Created by DeBasser on 09.07.2016.
 */
public class TestHM {
    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<>(6);
        map.put(6, "A");
        map.put(12, "B");
        map.put(16, "C");
        map.put(24, "D");
        map.put(18, "E");
    }
}