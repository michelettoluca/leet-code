package it.lucamicheletto.easy;

public class LC_28_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String substring = haystack.substring(i, i + needle.length());
            if (substring.equals(needle)) return i;
        }

        return -1;
    }
}
