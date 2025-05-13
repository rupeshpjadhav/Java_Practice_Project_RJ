package javaPracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonInArrays {

    public static void main(String[] args) {


        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2,3,4, 5, 6, 7, 8};


        List<Integer> common_arr = findCommon(a1, a2);

       // System.out.println(common_arr);

        for (int x: common_arr) {
            System.out.print(x + " ");
        }

    }

    public static List<Integer> findCommon(int[] a1, int[] a2) {
        List<Integer> new_arr = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {

            for (int j = 0; j < a2.length; j++) {

                if (a1[i] == a2[j]) {
                    new_arr.add(a1[i]);

                }
            }
        }
        return new_arr;
    }
}
