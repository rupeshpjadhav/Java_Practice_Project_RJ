package javaPracticePrograms;

import java.util.Arrays;

public class AnagramCheckWithSortingFn {

    public static void main(String[] args) {

        if (IsAnagram("listen", "silent")) {
            System.out.println("Given words are Anagram");
        }
        else {
            System.out.println("Given words are not Anagram");
        };
    }



    public static String sortedString (String s) {
        // function to sort the string using bubble sort
        char [] a = s.toCharArray();

        for (int i = 0; i < a.length-1;i++) {

            for (int j =0; j< a.length-i-1; j++) {

                if (a[j] > a[j+1]) {
                    char temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        return Arrays.toString(a);
    }


    public static boolean IsAnagram (String s1, String s2) {

        if (sortedString(s1).equals(sortedString(s2)) ) {
            return true;
        }
        else {
            return false;
        }
    }
}
