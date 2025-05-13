package javaPracticePrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcherProg {
    // Examples
    // ^[a-zA-Z0-9_.\-$]+@[a-zA-Z]+\.[a-z]{2,}$
    // to find valid email ids
    // ^[a-zA-Z0-9_.\-$]+   = to find alpha numeric characters


    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter regex to check ");
            Scanner sc = new Scanner(System.in);

            String regex= sc.nextLine();

            System.out.println("Enter input string to check ");
            String input = sc.nextLine();

            System.out.println(RegexChecker (regex, input));

            System.out.println("Do you want to continue? Y/N ");

            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static boolean RegexChecker (String regex, String input) {

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(input);

       // boolean out = m.matches();
        boolean out = m.find();
        return out;


    }
}
