package javaPracticePrograms;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 = ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping, num 1 = "+num1);
        System.out.println("Before Swapping, num 2 = "+num2);

        num2 = (num1 + num2) ;
        num1 = num2 - num1 ;
        num2 = num2 - num1;


        System.out.println("After Swapping, num 1 = "+num1);
        System.out.println("After Swapping, num 2 = "+num2);

    }
}
