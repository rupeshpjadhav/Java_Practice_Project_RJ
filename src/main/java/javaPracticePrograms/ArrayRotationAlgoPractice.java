package javaPracticePrograms;

public class ArrayRotationAlgoPractice {


    public static void main(String[] args) {
// method 1 - brute force

        int[] a = {1, 2, 3, 4, 5, 6};
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        int k = 3;
        int n = a.length;
        int[] temp = new int[k];
        int t = temp.length;

        for (int i = 0; i < t; i++) {
            temp [i] = a[i];
        }

        for (int i = 0; i < k ; i++) {
            a[i] = a[k + i];
        }

        for (int i = k; i<n;i++) {
            a[i] = temp [i-k];
        }


        for (int y : a) {
            System.out.print(y + " ");
        }

        // method 2 - using reverse

        reverse(a, 0, n-k-1);
        reverse(a, n-k, n-1);
        reverse(a, 0, n-1);
        System.out.println();

        for (int z : a) {
            System.out.print(z + " ");
        }
    }


    public static void reverse(int []a, int si, int ei) {
        //

        while (si<ei) {
            int temp = a[si];
            a[si] = a[ei];
            a[ei] = temp;
            si ++;
            ei--;
        }
    }
}
