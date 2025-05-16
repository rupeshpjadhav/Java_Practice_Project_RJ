package javaPracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class LeaderArrayExample {
    // find largest number in the array which is larger than numbers to its right ... [9,7,5,2,1]

    public static void main(String[] args) {
        System.out.println("Approach 1");
        int [] arr = {4,3,6,9,7,5,2,1};
        int l = arr.length;
        // Approach 1 - using 2 for loops
        //int mx = arr[0];

        for (int i = 0; i<l;i++ ) {
            boolean status = true;
            for (int j = i+1; j<l;j++) {
                if(arr[i]<arr[j]) {
                    status = false;
                    break;
                }
            }
            if(status) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();

        System.out.println("Approach 2");

        // Approach 2 - using reverse for loop - recommended approach



        int max = arr[l-1];
        //System.out.print(max);
        List<Integer> temp = new ArrayList<>();
        temp.add(max);

        for (int i = l-2; i>=0; i--) {
            if(arr[i]>max) {
                max = arr[i];
                temp.add(max);
                //System.out.print(" "+max);
            }
        }

        int t = temp.size();
        for (int i=t-1; i>=0;i--) {
            System.out.print(temp.get(i) + " ");
        }


    }

}
