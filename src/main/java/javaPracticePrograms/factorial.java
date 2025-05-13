package javaPracticePrograms;

public class factorial {

    public static void main(String[] args) {

        int num = 5;
        long fact = 1;
        long factorial = 1;
        //approach 1 - using for loop
        for (int i =num; i>0;i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        //approach 2 - using while loop
        while (num>0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial);
    }
}
