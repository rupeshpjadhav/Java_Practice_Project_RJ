package javaPracticePrograms;

import java.util.Scanner;

public class DigitsSumCount {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        countOfDigits(num); //to find the count of digits in the number
        sumOfDigits(num);  //to find sum of digits in the number
    }

    public static void countOfDigits (int number){
        int count = 0;

        while (number>0) {
            number = number / 10;
            count ++;
        }
        System.out.println("Total count of digits is "+count);

    }


    public static void sumOfDigits (int numbers){
        int sum = 0;
        while (numbers>0) {
            sum = sum + (numbers % 10);
            numbers = numbers / 10;
        }
        System.out.println("Total sum of digits is "+sum);

    }
}
