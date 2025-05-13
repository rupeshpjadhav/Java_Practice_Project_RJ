package javaPracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3); // original array
        List<Integer> rotate = Arrays.asList(1, 2, 3, 4); // this is array with rotation shift.
        // so a will be shifted by 1,2,3,4 each time.

        List<Integer> result = getMaxElementIndexes(a, rotate); // after each rotation, we will get max index
        System.out.println(result); // Output: [1, 0, 2, 1]
    }


    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        int n = a.size();
        List<Integer> indices = new ArrayList<>();

        for (int r : rotate) {
            // Calculate effective rotation
            int shift = r % n;
            // example 1% 3 returns 1, 2%3 returns 2 , 3%3 returns 0, 4%3 returns 1

            // Rotate the array by creating a new list
            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(a.subList(shift, n));
            rotated.addAll(a.subList(0, shift));

            // Find index of max element in rotated list
            int maxIndex = 0;
            int maxVal = rotated.get(0);
            for (int i = 1; i < n; i++) {
                if (rotated.get(i) > maxVal) {
                    maxVal = rotated.get(i);
                    maxIndex = i;
                }
            }

            indices.add(maxIndex);
        }

        return indices;
    }



}
