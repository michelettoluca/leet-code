package it.lucamicheletto.easy;

import java.util.HashMap;

public class LC_242_ValidAnagram {
    // Sorting is also an option, I can't be fucked right now
    // to check the time complexity it's 3 a.m. gn

    public boolean isAnagram(String s, String t) {
        var charactersCountS = getCharactersCount(s);
        var charactersCountT = getCharactersCount(t);

        if (charactersCountS.size() != charactersCountT.size()) return false;

        for (var entry : charactersCountS.entrySet()) {
            Integer characterCount = charactersCountT.get(entry.getKey());

            if (characterCount == null) return false;

            if (!characterCount.equals(entry.getValue())) return false;
        }

        return true;
    }

    private HashMap<Character, Integer> getCharactersCount(String str) {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            characterCount.merge(c, 1, Integer::sum);
        }

        return characterCount;
    }
}