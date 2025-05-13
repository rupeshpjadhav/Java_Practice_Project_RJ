package javaPracticePrograms;
import java.util.*;
public class BracketsProgCS {


        public static void main(String[] args) {
            // You can test different inputs here:
            String s = "{}<[>(])";  // Change this to test other inputs

            // #  () {} [] <>
            // # input s = "(())" -> True
            // # input s = "{}<[>(])". -> True
            // # input s = "{<" -> False,
            // # input s = "<{>" -> False,

            String result = checkBrackets(s);
            System.out.println(result);
        }

        public static String checkBrackets(String s) {
            Stack<Character> stack = new Stack<>();

            // Map closing -> opening
            Map<Character, Character> closingToOpening = Map.of(
                    ')', '(',
                    '}', '{',
                    ']', '[',
                    '>', '<'
            );

            // Map opening -> closing (for missing brackets)
            Map<Character, Character> openingToClosing = Map.of(
                    '(', ')',
                    '{', '}',
                    '[', ']',
                    '<', '>'
            );

            for (char ch : s.toCharArray()) {
                // If it's an opening bracket, push to stack
                if (openingToClosing.containsKey(ch)) {
                    stack.push(ch);
                }
                // If it's a closing bracket
                else if (closingToOpening.containsKey(ch)) {
                    // Stack must not be empty, and top must match the pair
                    if (stack.isEmpty() || stack.peek() != closingToOpening.get(ch)) {
                        return "False, missing " + (stack.isEmpty() ? closingToOpening.get(ch) : openingToClosing.get(stack.peek()));
                    } else {
                        stack.pop(); // Correct match
                    }
                }
            }

            // If any unmatched opening brackets remain
            if (!stack.isEmpty()) {
                StringBuilder missing = new StringBuilder();
                while (!stack.isEmpty()) {
                    char open = stack.pop();
                    missing.append(openingToClosing.get(open));
                }
                return "False, missing " + missing.toString();
            }

            return "True";
        }
    }


