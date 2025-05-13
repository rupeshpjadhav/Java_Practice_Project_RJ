package javaPracticePrograms;

public class MissingNumberInArray {
    //find min and max number in array. And then find the missing number in the array [1,2,3,4,6,7,8]
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 7, 8, 9};

        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Min and max numbers are " + min + "," + max);
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }

        for (int j = min; j <= max; j++) {
            sum2 = sum2 + j;

        }

        System.out.println("Missing number in Array is " + (sum2 - sum1));


    }
}





