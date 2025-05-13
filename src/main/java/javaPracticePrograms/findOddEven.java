package javaPracticePrograms;

public class findOddEven {

    public static void main(String[] args) {
        int num = 123456789;
        int even_cnt = 0;
        int odd_cnt = 0;

        //Approach 1 - by converting int to string;
        String numStr = Integer.toString(num);
        int len = numStr.length();

        for (int i =0; i<len; i++) {

            if (numStr.charAt(i) %2 == 0){
                System.out.println(numStr.charAt(i) + " is an even number");
                even_cnt++;
            }
            else {
                System.out.println(numStr.charAt(i) + " is an odd number");
                odd_cnt++;
            }
        }

        System.out.println("Total even numbers are "+even_cnt);
        System.out.println("Total odd numbers are "+odd_cnt);

        //Approach 2 - working on the integer itself;
        int even_count = 0;
        int odd_count = 0;
        while(num>0){
            int newnum = num % 10;
            if (newnum % 2 == 0){
                System.out.println(newnum + " is an even number");
                even_count++;
            }
            else {
                System.out.println(newnum + " is an odd number");
                odd_count++;
            }
            num = num / 10;
        }
        System.out.println("Total even numbers are "+even_count);
        System.out.println("Total odd numbers are "+odd_count);


    }
}
