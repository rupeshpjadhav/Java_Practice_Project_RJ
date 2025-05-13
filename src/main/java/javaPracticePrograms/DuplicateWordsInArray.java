package javaPracticePrograms;

import java.util.HashSet;

public class DuplicateWordsInArray {

    public static void main(String[] args) {

        // approach 1 - by using string

        String [] s = {"java", "c++", "python", "c#", "python", "c#", "python"};

        for (int i=0; i< s.length; i++) {

            for (int j = i+1; j<s.length;j++) {

                if (s[i] == s[j]) {
                    System.out.println("Prog 1-> Duplicate word found " +s[i]);
                }
            }
        }

        // approach 2 - by using hashset- it doesn't allow duplicate to be added

        HashSet hs = new HashSet();
        for (int a = 0; a<s.length;a++) {
            boolean status = false;
            //hs.add(s[a]);
            if (!hs.add(s[a])) {
                System.out.println("Prog 2 -> Duplicate word found " +s[a]);
                status = true;
            }

            if (status==false) {
                System.out.println("Duplicate not found");
            }
        }


    }
}
