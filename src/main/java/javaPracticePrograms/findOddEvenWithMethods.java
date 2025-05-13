package javaPracticePrograms;

import java.util.Scanner;

public class findOddEvenWithMethods {

    public static void main(String[] args) {
        //Created 2 functions for 2 different approaches;
        //int num = 123456789;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findOddEven(num); //Approach 1 - by converting int to string;
        findOddEven2(num); //Approach 2 - working on the integer itself;
    }


    public static void findOddEven (int number) {
        int even_cnt = 0;
        int odd_cnt = 0;

        //Approach 1 - by converting int to string;
        System.out.println("==========================");
        System.out.println("Running from findOddEven function");
        String numStr = Integer.toString(number);
        int len = numStr.length();

        for (int i =0; i<len; i++) {

            if (numStr.charAt(i) %2 == 0){
                System.out.println(numStr.charAt(i) + " is an even number");
                even_cnt++;
            }
            else {
                System.out.println(numStr.charAt(i) + " is an odd number");
                odd_cnt++;
            }
        }

        System.out.println("Total even numbers are "+even_cnt);
        System.out.println("Total odd numbers are "+odd_cnt);
    }


    public static void findOddEven2 (int numbers) {
        //Approach 2 - working on the integer itself;
        System.out.println("==========================");
        System.out.println("Running from findOddEven2 function");
        int even_count = 0;
        int odd_count = 0;
        while(numbers>0){
            int newnum = numbers % 10;
            if (newnum % 2 == 0){
                System.out.println(newnum + " is an even number");
                even_count++;
            }
            else {
                System.out.println(newnum + " is an odd number");
                odd_count++;
            }
            numbers = numbers / 10;
        }
        System.out.println("Total even numbers are "+even_count);
        System.out.println("Total odd numbers are "+odd_count);
    }
}
