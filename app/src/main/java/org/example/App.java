
package org.example;

import java.util.HashMap;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = Zip.zip(nums1, nums2);
        System.out.println(mergedNumbers); // [1, 2, 3, 4, 5, 6, 7, 8]

        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        List<String> mergedWords = Zip.zip(colors1, colors2);
        System.out.println(mergedWords);

        // Extra credit
        List<String> colors = List.of("White", "Black", "Orange", "Pink");
        List<Integer> nums = List.of(1, 3, 5, 7);
        HashMap<String, Integer> map = Hashmapify.hashmapify(colors, nums);
        System.out.println(map);
    }
}