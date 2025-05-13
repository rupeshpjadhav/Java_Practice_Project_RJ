package javaPracticePrograms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {


        int[] a = {3, 4, 8, 1, 2, 5, 9};

        //approach 1 using bubble sort
        // inner loop will compare all elements and swap and then push the largest to the end.
        // inner loop will reduce its loop each time as the end of loop starts becoming highest
        // after 1st iteration, inner loop will reduce the loop and so on

        System.out.println("Original array -> " + Arrays.toString(a));
        for (int i = 0; i <a.length-1;i++) {   // outer loop for n-1 iterations

            for (int j =0;j<a.length-i-1;j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Using bubble sort -> " + Arrays.toString(a));

        //approach 2 using selection sort
        // The inner loop selects the minimum element in the unsorted array
        // and places the elements in increasing order.
        // inner loops starts reducing from start after each iteration
        // swapping happens once in each iteration
        // swapping of a[x] with a[min]

        for (int x = 0; x<a.length-1;x++) {
            int min = x;
            for (int y = x +1; y < a.length; y++) {
                if (a[y]<a[min]) {
                    min = y;
                }
            }
            //swapping
            int newtemp = a[x];
            a[x] = a[min];
            a[min] = newtemp;


        }
        System.out.println("Using selection sort -> "+Arrays.toString(a));



    }
}