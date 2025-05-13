package javaPracticePrograms;

public class ArrayPrograms {

    public static void main(String[] args) {

        // prog 1 - do sum of all elements of array

        int [] a = {1,2,3,4,5,6,7,8};

        int sum = 0;

        for (int i = 0; i < a.length;i++) {
            sum = sum + a[i];
        }

        System.out.println("sum is " +sum);

        // prog 2 - find even and odd in the array

        int [] b = {1,2,3,4,5,6,7,8};
        int odd_cnt = 0, even_cnt = 0;
        for (int j =0; j< b.length; j++) {

            if (b[j] % 2 == 0) {
                even_cnt ++;
                System.out.println(b[j]+ " is even number");
            }
            else {
                odd_cnt++;
                System.out.println(b[j]+ " is odd number");
            }
        }
        System.out.println("Total even numbers are " +even_cnt);
        System.out.println("Total odd numbers are " +odd_cnt);


        // find duplicate number in array

        int[] arr = {1,2,3,4,5,6,7,8,4,4};
        boolean status = false;
        int countDup =0;
        for (int i = 0; i<arr.length-1; i++) {

            for (int j = i+1; j<arr.length; j++)  {
                if (arr[i] == arr[j]) {
                        status = true;
                        countDup++;
                    System.out.println(countDup + " duplicate value " +arr[i] +" found at index " +i + " and " +j);

                }

            }

        }
        if (!status) {
            System.out.println("No duplicate found");
        }

    }

}
