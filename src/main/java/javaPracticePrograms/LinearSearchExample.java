package javaPracticePrograms;

public class LinearSearchExample
{ //time complexity - O[1] - best - O[n] worst
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8};

        int l = a.length; //8
        int k = 6;

        for (int i=0; i<l; i++) {
            if (a[i]==k) {
                System.out.println("Element found at index "+i);
            }
        }

    }



 }
