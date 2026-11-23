package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class ZipTest {

    @Test
    public void testIntegersSameLength() {
        List<Integer> result = Zip.zip(List.of(1, 3, 5, 7), List.of(2, 4, 6, 8));
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), result);
    }

    @Test
    public void testStringsSecondListLonger() {
        List<String> result = Zip.zip(
                List.of("Red", "Green", "Blue"),
                List.of("White", "Black", "Orange", "Pink", "Fuschia"));
        assertEquals(List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink", "Fuschia"), result);
    }

    @Test
    public void testFirstListLonger() {
        List<Integer> result = Zip.zip(List.of(1, 2, 3, 4, 5), List.of(10, 20));
        assertEquals(List.of(1, 10, 2, 20, 3, 4, 5), result);
    }

    @Test
    public void testFirstListEmpty() {
        List<String> result = Zip.zip(List.of(), List.of("a", "b"));
        assertEquals(List.of("a", "b"), result);
    }

    @Test
    public void testSecondListEmpty() {
        List<String> result = Zip.zip(List.of("a", "b"), List.of());
        assertEquals(List.of("a", "b"), result);
    }

    @Test
    public void testBothListsEmpty() {
        List<Integer> result = Zip.zip(List.of(), List.of());
        assertEquals(List.of(), result);
    }

    @Test
    public void testDoubles() {
        List<Double> result = Zip.zip(List.of(1.5, 3.5), List.of(2.5, 4.5));
        assertEquals(List.of(1.5, 2.5, 3.5, 4.5), result);
    }

    @Test
    public void testCharacters() {
        List<Character> result = Zip.zip(List.of('a', 'c'), List.of('b', 'd', 'e'));
        assertEquals(List.of('a', 'b', 'c', 'd', 'e'), result);
    }

    @Test
    public void testBooleans() {
        List<Boolean> result = Zip.zip(List.of(true, true), List.of(false, false));
        assertEquals(List.of(true, false, true, false), result);
    }

    @Test
    public void testSingleElementEach() {
        List<String> result = Zip.zip(List.of("x"), List.of("y"));
        assertEquals(List.of("x", "y"), result);
    }
}