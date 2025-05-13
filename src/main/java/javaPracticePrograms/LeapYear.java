package javaPracticePrograms;

public class LeapYear {
    public static void main(String[] args) {
        int years = 2000;
        Boolean checkYear = IsLeapYear(years);

        if (checkYear) {
            System.out.println(years + " is a leap year");
        }
        else {
            System.out.println(years + " is not a leap year");
        }

    }

    public static boolean IsLeapYear(int year) {
        // logic is that year should be divisible by 4. Else it is not leap year
        // Also if it is divisible by 100 then it should also be divisible by 400 or else it is not leap year

        if (year % 4 == 0) {
            if (year % 100 ==0) {
                if(year % 400 ==0) {
                    //System.out.println("it is leap year");
                    return true;

                }
                else {
                   // System.out.println("it is not a leap year");
                    return false;
                }

            }
            else {
                //System.out.println("it is leap year");
                return true;
            }
        }
        else {
            //System.out.println("Not a leap year");
            return false;
        }

    }
}