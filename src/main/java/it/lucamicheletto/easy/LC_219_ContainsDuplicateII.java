package it.lucamicheletto.easy;

import java.util.HashMap;

public class LC_219_ContainsDuplicateII {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int gap = 1; gap <= k; gap++) {
//            for (int i = 0; i < nums.length - gap; i++) {
//                if (nums[i] == nums[i + gap]) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> occurencies = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = occurencies.get(nums[i]);

            if (index != null && i - index <= k) {
                return true;
            }

            occurencies.put(nums[i], i);
        }

        return false;
    }
}