package it.lucamicheletto.easy;

public class LC_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        s = s.toUpperCase();

        while (l < r) {
            if (!isValidChar(s.charAt(l))) {
                l++;
            } else if (!isValidChar(s.charAt(r))) {
                r++;
            } else if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean isValidChar(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
