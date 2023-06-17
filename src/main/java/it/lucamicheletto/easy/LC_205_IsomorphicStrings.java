package it.lucamicheletto.easy;

import java.util.HashMap;

public class LC_205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() == 0 && t.length() == 0) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        // Could use two arrays because the problem specified that only
        // ascii char were allowed (char[128])
        HashMap<Character, Character> corrispondance = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character match = corrispondance.get(s.charAt(i));

            if (match == null) {
                if (hasValue(corrispondance, t.charAt(i))) {
                    return false;
                }

                corrispondance.put(s.charAt(i), t.charAt(i));
            } else if (match != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    private <K, V> boolean hasValue(HashMap<K, V> map, V value) {
        return map.values().stream().anyMatch(v -> v == value);
    }
}