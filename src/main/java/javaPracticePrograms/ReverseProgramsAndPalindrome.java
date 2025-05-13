package javaPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseProgramsAndPalindrome {
    //static int n;
    public static void main(String[] args) {
        //Write program to reverse a string, number and array
        //int n = 123456;
        //String s = "abcdcba";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n = sc.nextInt();
        System.out.println("Enter a string to reverse");
        String s = sc.next();
        System.out.println("Enter elements of an array to reverse");
        int[] origArray = new int[5];
        origArray[0] = sc.nextInt();
        origArray[1] = sc.nextInt();
        origArray[2] = sc.nextInt();
        origArray[3] = sc.nextInt();
        origArray[4] = sc.nextInt();

        reverseNumber(n);
        reverseString(s);
        reverseArray(origArray);

    }

    public static void reverseNumber(int num) {
        int orignum = num;
        int revNum = 0;
        while (num > 0) {
            revNum = (revNum * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println("The original number is " + orignum);
        System.out.println("The reverse number is " + revNum);

        if (revNum == orignum) {
            System.out.println("This is palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }

    }


    public static void reverseString(String str) {
        String revString = "";

        for (int j = str.length() - 1; j >= 0; j--) {
            revString = revString + str.charAt(j);
        }
        System.out.println("The original string is " + str);
        System.out.println("The reverse string is " + revString);

        if (revString.equals(str)) {
            System.out.println("It is palindrome string");
        } else {
            System.out.println("It is not a palindrome string");
        }
    }

    public static void reverseArray(int[] arrayInput) {
        int l = arrayInput.length;
        int[] revArray = new int[l];
        int len = l;
        for (int i = 0; i < l; i++) {
            revArray[len - 1] = arrayInput[i];
            len--;
        }
        System.out.println("Original Array is " + Arrays.toString(arrayInput));
        System.out.println("Reversed Array is " + Arrays.toString(revArray));


        if (Arrays.toString(revArray).equals(Arrays.toString(arrayInput))) {
            System.out.println("It is palindrome array");
        } else {
            System.out.println("It is not a palindrome array");
        }
    }
}
