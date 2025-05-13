package javaPracticePrograms;

import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 = ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3 = ");
        int num3 = sc.nextInt();
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1+ " is largest number");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2+ " is largest number");
        }
        else {
            System.out.println(num3+ " is largest number");
        }

        //using ternary operator
        String x = ((num1 > num2) && (num1 > num3))? "num 1 is largest number": "check";
        if (x == "check") {
            x =((num2 > num1) && (num2 > num3)) ? "num 2 is largest number": "num 3 is largest number";
        }

        System.out.println(x);


    }
}
