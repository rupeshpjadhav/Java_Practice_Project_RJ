package javaPracticePrograms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int [] orig_arr = {7,8,6,5,9,2,4,1};
        System.out.println("Before Sorting: "+Arrays.toString(orig_arr));

        divide(orig_arr, 0, orig_arr.length-1);

        System.out.println("After Sorting: "+ Arrays.toString(orig_arr));



    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);        // recursively sort left half
        divide(arr, mid + 1, ei);    // recursively sort right half

        conquer(arr, si, mid, ei);   // merge the two halves
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;         // pointer for left half
        int idx2 = mid + 1;    // pointer for right half
        int x = 0;             // index for merged array

        // Merge both halves
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Add remaining elements from left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Add remaining elements from right half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

}
