package javaPracticePrograms;

public class patterns {

    public static void main(String[] args) {
// 1. Solid Rectangle Star pattern
/* Like this
 ******
 ******
 ******
 ******
 */
        for (int i = 1; i<=4; i++) {

            for (int j=1; j<=6; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("===================================");

// 2. Hollow Rectangle Star pattern
/* Like this

*****
*   *
*   *
*****

*/


        int r = 4;
        int c = 5;

        for (int i = 1; i<=r;i++) {

            for (int j = 1; j<=c; j++) {

                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("===================================");
// 3. Half pyramid Star pattern
        /* Like this

         *
         **
         ***
         ****

         */


        int row = 4;

        for (int i = 1; i<=row; i++) {

            for (int j= 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("===================================");


        // 4. Half pyramid Star pattern - inverted
        /* Like this

         ****
         ***
         **
         *

         */


        int rw = 4;

        for (int i = 1; i<=rw; i++) {

            for (int j= rw; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("===================================");


        // 5. Half pyramid Star pattern - inverted with spaces in start
        /* Like this

            *
           **
          ***
         ****

         */

        for (int i = 1; i<=rw; i++) {

            for (int j = 1; j<=rw-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i;j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("===================================");

        // 6. Print number pattern
        /* Like this

         1
         12
         123
         1234

         */

        for (int i = 1; i<=rw; i++) {

            for(int j=1; j<=i;j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        System.out.println("===================================");


        // 7. Print number pattern
        /* Like this

         1234
         123
         12
         1

         */

        for (int i = 1; i<=rw; i++) {

            for(int j=1; j<=rw-i+1;j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        System.out.println("===================================");

        // 8. Print number pattern - floyd's triangle
        /* Like this

         1
         23
         456
         78910


         */
        int num = 1;
        for (int i = 1; i<=rw; i++) {

            for(int j=1; j<=i;j++) {
                System.out.print(num +" ");
                num++;
            }

            System.out.println();
        }


        System.out.println("===================================");

        // 9. Print number pattern -
        /* Like this

         1
         01
         101
         0101


         */

        for (int i = 1; i<=rw; i++) {

            for(int j=1; j<=i;j++) {

                int sum = i+j;
                if(sum%2 == 0) {
                    System.out.print(1);

                }
                else {
                    System.out.print(0);
                }

            }

            System.out.println();
        }


        System.out.println("===================================");

    }
}
