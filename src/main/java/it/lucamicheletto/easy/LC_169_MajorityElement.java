package it.lucamicheletto.easy;

import java.util.HashMap;
import java.util.Map;

public class LC_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int threshold = nums.length / 2;

        HashMap<Integer, Integer> numsCount = new HashMap<>();

        for (int num : nums) {
            numsCount.merge(num, 1, Integer::sum);
        }

        return numsCount.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > threshold)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}
