package org.example;

import java.util.HashMap;
import java.util.List;

public class Hashmapify {
    public static <T> HashMap<String, T> hashmapify(List<String> keys, List<T> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Lists must be the same size");
        }

        HashMap<String, T> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}
