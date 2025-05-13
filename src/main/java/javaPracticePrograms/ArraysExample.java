package javaPracticePrograms;

public class ArraysExample {

    public static void main(String[] args) {


        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 11;
        arr1[2] = 12;
        arr1[3] = 13;
        arr1[4] = 14;

        for (int i = 0; i <arr1.length;i++) {
            System.out.println("arr1 is " +arr1[i]);
        }

        int arr2[] = {1, 2, 3, 4, 5, 6};

        for (int a : arr2) {
            System.out.println("arr2 is " +a);
        }

        int arr3[][] = new int[2][3];
        arr3[0][0] = 100;
        arr3[0][1] = 200;
        arr3[0][2] = 300;
        arr3[1][0] = 400;
        arr3[1][1] = 500;
        arr3[1][2] = 600;

        for (int r = 0; r < arr3.length; r++){

            for (int c=0;c<arr3[r].length;c++) {

                System.out.print(arr3[r][c]+ " ");
            }
            System.out.print("\n");
        }



        int arr4[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int [] b: arr4) {

            for (int x:b) {
                System.out.print(x+" ");
            }
            System.out.println("");
        }


    }
}
