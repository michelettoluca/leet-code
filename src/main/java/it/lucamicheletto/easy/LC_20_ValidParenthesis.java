package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC_20_ValidParenthesis {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);

            } else if (stack.isEmpty()) {
                return false;

            } else if (c == ')' || c == ']' || c == '}') {
                char top = stack.pop();

                if (c != getMatchingClosingParenthesis(top)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private Character getMatchingClosingParenthesis(char openingParenthesis) {
        return switch (openingParenthesis) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> null;
        };
    }
}
