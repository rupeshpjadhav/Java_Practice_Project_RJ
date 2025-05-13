package javaPracticePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotationOptimizedHR {

        public static void main(String[] args) {
            List<Integer> a = Arrays.asList(1, 2, 3);
            List<Integer> rotate = Arrays.asList(1, 2, 3, 4);

            List<Integer> result = getMaxElementIndexes(a, rotate);
            System.out.println(result); // Output: [1, 0, 2, 1]
        }

        public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
            int n = a.size();
            List<Integer> indices = new ArrayList<>();

            for (int r : rotate) {
                int shift = r % n;
                // example 1% 3 returns 1, 2%3 returns 2 , 3%3 returns 0, 4%3 returns 1

                //int maxVal = Integer.MIN_VALUE;
                int maxVal = 0;
                int maxIndex = 0;

                for (int i = 0; i < n; i++) {
                    int rotatedIndex = (i + shift) % n;
                    //It calculates where the element from the original array will be after rotating.
                    int val = a.get(rotatedIndex);

                    if (val > maxVal) {
                        maxVal = val;
                        maxIndex = i;
                    }
                }

                indices.add(maxIndex);
            }

            return indices;
        }
    }


