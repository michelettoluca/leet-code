package it.lucamicheletto.easy;

public class LC_13_RomanToInteger {
    public int romanToInt(String s) {
        int total = 0;
        int current;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            current = romanDigitToInt(s.charAt(i));

            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;
    }

    public int romanDigitToInt(char romanDigit) {
        return switch (romanDigit) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
