package javaPracticePrograms;
import java.util.*;  // Import utility classes like Stack, Map, and Set
public class BracketsProgCSOrig {

        public static String checkTheBrackets(String s) {
            Stack<Character> st = new Stack<>();

            // Mapping closing brackets to their corresponding opening brackets
            Map<Character, Character> pair = Map.of(
                    ')', '(',
                    '}', '{',
                    ']', '[',
                    '>', '<'
            );

            // Set of valid opening and closing brackets
            Set<Character> openingBrackets = Set.of('(', '{', '[', '<');
            Set<Character> closingBrackets = pair.keySet();

            for (char c : s.toCharArray()) {
                if (openingBrackets.contains(c)) {
                    // Push opening brackets onto the stack
                    st.push(c);
                } else if (closingBrackets.contains(c)) {
                    // If stack is empty or top does not match expected opening
                    if (st.isEmpty() || st.peek() != pair.get(c)) {
                        return "False, missing " + (st.isEmpty() ? pair.get(c) : getClosing(st.peek()));
                    } else {
                        // Proper pair found, pop the opening
                        st.pop();
                    }
                }
            }

            // If any unmatched opening brackets remain
            if (!st.isEmpty()) {
                StringBuilder missing = new StringBuilder();
                while (!st.isEmpty()) {
                    missing.append(getClosing(st.pop()));
                }
                return "False, missing " + missing.toString();
            }

            // All brackets matched
            return "True";
        }

        // Helper function to get matching closing bracket for an opening bracket
        private static char getClosing(char open) {
            return switch (open) {
                case '(' -> ')';
                case '{' -> '}';
                case '[' -> ']';
                case '<' -> '>';
                default -> '?';
            };
        }

        // Sample usage
        public static void main(String[] args) {
            String[] inputs = {
                    "(())",
                    "{}<[>(])",
                    "{<",
                    "<{>"
            };

            for (String s : inputs) {
                System.out.println("Input: " + s + " → " + checkTheBrackets(s));
            }
        }
    }



