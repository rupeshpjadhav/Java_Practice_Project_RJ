package javaPracticePrograms;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int num = sc.nextInt();
        long result = findFactorial(num);
        System.out.println(result);
    }


    public static long findFactorial(int n) {

        if (n==0) { // base case
            return 1;
        }
        else {
            return (n * findFactorial(n-1));  //recursive call
        }
    }

}
