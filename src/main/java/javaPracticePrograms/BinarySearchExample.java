package javaPracticePrograms;

public class BinarySearchExample {
    //time complexity - O[1] - best - O[log n] worst - here time is reduced compared to linear searc
    public static void main (String[] args)
    {

        int [] a = {1,2,3,4,5,6,7,8,9};

        int l = 0;
        int h = a.length-1;
        int k = 5;
        int m=0;
        boolean status = false;

        while (l<=h) {
            m = (l + h)/2;

            if (k > a[m]) {
                l = m+1;
            }
            if (k == a[m]) {
                //System.out.println("Number found at index "+m);
                status = true;
                break;
            }
            if (k < a[m]) {
                h = m-1;
            }
        }
        if (status) {
            System.out.println("Number found at index "+m);
        }
        else {
            System.out.println("Number does not exist");
        }


    }
}
