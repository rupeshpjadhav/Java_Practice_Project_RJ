package javaPracticePrograms;

public class MergeSortingExample {

    public static void main(String[] args) {
        int [] arr = {8,6,9,5,7,3,4,1,2};
        System.out.println("Before sorting : ");
        printArray(arr);
        System.out.println();

        int n = arr.length;
        mergeSort (arr,0,n-1);
        System.out.println("After sorting : ");
        printArray (arr);

     }


     public static void mergeSort(int []arr, int l, int r)
     {
         if (l>=r) return;
         int m = (l +r)/2 ;
         mergeSort(arr,l,m);
         mergeSort(arr,m+1,r);
         merge (arr,l,m,r);

     }

    public static void merge(int []arr, int l, int m, int r) {
        int n1 = (m - l + 1);
        int n2 = (r - m);

        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i <n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }


    }
    public static void printArray(int []arr)
    {
        for (int x: arr) {
            System.out.print(x + " ");
        }

    }

}
