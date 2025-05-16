package javaPracticePrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharsString {

    public static void main(String[] args) {

        String str = "abbbbccdddaaeefff"; // expected output is abcdef
        char[] charArray = str.toCharArray();
        int l = charArray.length;
        LinkedHashSet<Character> h = new LinkedHashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<l; i++) {
            h.add(charArray[i]);
        }

        for (char c:h) {
            sb.append(c);
        }

        System.out.println(sb);
    }

}
