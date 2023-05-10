package it.lucamicheletto.easy;

public class LC_14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return null;
        }

        String shortestStr = strs[0];

        for (String str : strs) {
            if (str.length() < shortestStr.length()) {
                shortestStr = str;
            }
        }

        for (int i = 0; i < shortestStr.length(); i++) {
            for (String str: strs) {
                if (shortestStr.charAt(i) != str.charAt(i)) {
                    return shortestStr.substring(0, i);
                }
            }
        }

        return shortestStr;
    }
}
