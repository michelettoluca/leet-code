package it.lucamicheletto.easy;

import java.util.HashSet;
import java.util.Set;

public class LC_136_SingleNumber {
    public int singleNumber(int[] nums) {
        // XOR bullshit also works, need to study binary operation properties

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.stream().toList().get(0);
    }
}
