package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zip {
    public static <T> List<T> zip(List<T> first, List<T> second) {
        List<T> result = new ArrayList<>();

        int i = 0;

        while (i < first.size() && i < second.size()) {
            result.add(first.get(i));
            result.add(second.get(i));
            i++;
        }

        while (i < first.size()) {
            result.add(first.get(i));
            i++;
        }
        while (i < second.size()) {
            result.add(second.get(i));
            i++;
        }

        return result;
    }
}