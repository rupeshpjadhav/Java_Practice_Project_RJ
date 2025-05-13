package javaPracticePrograms;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to find prime numbers");
        int num = sc.nextInt();
        System.out.println("To find prime numbers till "+num);
        findPrimeNos(num);
    }

    public static void findPrimeNos (int number){
        int count = 0;
        System.out.println("List of prime numbers are as follows: ");
        for (int i = 1; i<=number;i++) {

            if (i==1) {
               // System.out.println(i + " is not a prime number");;
            }
            else {
                if(isPrime(i)) {
                    System.out.println(i);
                    count++;
                }
                else {
                    //System.out.println(i + " is not a prime number");
                }
            }
        }
        System.out.println("Total count of prime numbers is "+count);

    }

    public static boolean isPrime (int n) {

        for (int j = 2; j<n;j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
