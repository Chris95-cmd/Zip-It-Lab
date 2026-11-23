package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class HashmapifyTest {

    @Test
    public void testHashmapifyIntegers() {
        HashMap<String, Integer> map = Hashmapify.hashmapify(
                List.of("White", "Black", "Orange", "Pink"),
                List.of(1, 3, 5, 7));

        assertEquals(4, map.size());
        assertEquals(1, map.get("White"));
        assertEquals(3, map.get("Black"));
        assertEquals(5, map.get("Orange"));
        assertEquals(7, map.get("Pink"));
    }

    @Test
    public void testHashmapifyStrings() {
        HashMap<String, String> map = Hashmapify.hashmapify(List.of("a", "b"), List.of("x", "y"));
        assertEquals("x", map.get("a"));
        assertEquals("y", map.get("b"));
    }

    @Test
    public void testHashmapifyDifferentSizesThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> Hashmapify.hashmapify(List.of("a", "b", "c"), List.of(1, 2)));
    }

    @Test
    public void testHashmapifyEmptyLists() {
        HashMap<String, Integer> map = Hashmapify.hashmapify(List.of(), List.of());
        assertEquals(0, map.size());
    }
}