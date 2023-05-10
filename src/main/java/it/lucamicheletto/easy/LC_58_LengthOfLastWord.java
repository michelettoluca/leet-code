package it.lucamicheletto.easy;

public class LC_58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1 && !s.equals(" ")) return 1;

        int end = s.length() - 1;

        while (s.charAt(end) == ' ') {
            end--;
        }

        int start = end - 1;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
}
