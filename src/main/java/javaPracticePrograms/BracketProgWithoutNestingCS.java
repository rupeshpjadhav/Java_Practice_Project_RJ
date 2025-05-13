package javaPracticePrograms;
import java.util.*;  // Import utility classes like Stack, Map, and Set
public class BracketProgWithoutNestingCS {

        public static void main(String[] args) {
            //String s = "{}<[>(])";  // You can test with different inputs

            String[] inputs = {
                    "(())",
                    "{}<[>(])",
                    "{<",
                    "<{>"
            };

            for (String s : inputs) {
                System.out.println("Input: " + s + " → " + checkBracketPairs(s));
            }

//            String result = checkBracketPairs(s);
//            System.out.println(result);
        }

        public static String checkBracketPairs(String s) {
            // Count map for brackets
            Map<Character, Integer> counts = new HashMap<>();

            // Define matching pairs
            Map<Character, Character> openToClose = Map.of(
                    '(', ')',
                    '{', '}',
                    '[', ']',
                    '<', '>'
            );

            // Reverse map: closing to opening
            Map<Character, Character> closeToOpen = new HashMap<>();
            for (Map.Entry<Character, Character> entry : openToClose.entrySet()) {
                closeToOpen.put(entry.getValue(), entry.getKey());
            }

            // Count brackets
            for (char ch : s.toCharArray()) {
                if (openToClose.containsKey(ch) || closeToOpen.containsKey(ch)) {
                    counts.put(ch, counts.getOrDefault(ch, 0) + 1);
                }
            }

            // Check each pair
            StringBuilder missing = new StringBuilder();
            for (char open : openToClose.keySet()) {
                char close = openToClose.get(open);
                int openCount = counts.getOrDefault(open, 0);
                int closeCount = counts.getOrDefault(close, 0);

                if (openCount > closeCount) {
                    // Missing closing brackets
                    for (int i = 0; i < openCount - closeCount; i++) {
                        missing.append(close);
                    }
                } else if (closeCount > openCount) {
                    // Missing opening brackets
                    for (int i = 0; i < closeCount - openCount; i++) {
                        missing.append(open);
                    }
                }
            }

            return missing.length() == 0 ? "True" : "False, missing " + missing;
        }
    }


