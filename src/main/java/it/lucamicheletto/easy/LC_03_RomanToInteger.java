package it.lucamicheletto.easy;

public class LC_03_RomanToInteger {
    public int romanToInt(String s) {
        int total = 0;

        int[] numbers = new int[s.length()];

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            numbers[i] = romanDigitToInt(chars[i]);
        }

        int i = 0;
        while (i < numbers.length) {
            int acc = 0;

            while (i != numbers.length - 1 && numbers[i] < numbers[i + 1]) {
                acc += numbers[i];
                i++;
            }

            total += numbers[i] - acc;
            i++;
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
