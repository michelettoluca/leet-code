package it.lucamicheletto.easy;

public class LC_02_IsPalindrome {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(len - i - 1);

            if (leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }
}
