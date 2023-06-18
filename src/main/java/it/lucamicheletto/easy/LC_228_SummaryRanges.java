package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.List;

public class LC_228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) return ranges;

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i] == nums[i + 1] - 1) {
                i++;
            }

            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(start + "");
            }
        }

        return ranges;
    }
}