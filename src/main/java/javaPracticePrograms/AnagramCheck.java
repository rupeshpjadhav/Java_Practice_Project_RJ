package javaPracticePrograms;

import java.util.Arrays;

public class AnagramCheck {
// anagram means different word can be formed with the same characters of a word.
// so after sorting it should be same.
    public static void main(String[] args) {

        if (IsAnagram("listen", "silent")) {
            System.out.println("They are Anagram words");
        }
        else {
            System.out.println("They are not Anagram words");
        }


    }


    public static boolean IsAnagram (String s1, String s2)
    {

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
