package javaPracticePrograms;
import java.util.*;
import java.util.regex.*;

public class FindDomainNames {

    public static void main(String[] args) {
        List<String> htmlLines = Arrays.asList(
                "Visit https://www.abc.xyz.com for more.",
                "<a href=\"http://abcd.xyz.com\">Link</a>",
                "<a href='http://hackerrank.com/challenges'>Hack</a>",
                "<p>Go to https://xyz.co m now!</p>"
        );


        String result = getPotentialDomains(htmlLines);
        System.out.println(result);
    }

    public static String getPotentialDomains(List<String> lines) {
        // TreeSet ensures unique domains and sorts them
        Set<String> domainSet = new TreeSet<>();

        // Regex to find domains in http/https links
        Pattern pattern = Pattern.compile("https?://(?:www\\.)?([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})");
         // "https?://(?:[a-zA-Z0-9]+\\.)?([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})"
        // (?:) makes it non-capturing group but it is used for checking


        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                domainSet.add(matcher.group(1)); // Extract and store domain
            }
        }

        // Join all domains with a semicolon
        return String.join(";", domainSet); // This is a new String object (dynamically allocated)
    }

}
