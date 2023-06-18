package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.List;

public class LC_228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) return ranges;

        int[] range = new int[]{nums[0], nums[0]};

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i] - 1) {
                range[1] = nums[i];

            } else {
                ranges.add(rangeToString(range));

                range[0] = range[1] = nums[i];
            }
        }

        if (range[1] == nums[nums.length - 1]) {
            ranges.add(rangeToString(range));
        }

        return ranges;
    }

    private String rangeToString(int[] range) {
        if (range[0] == range[1]) {
            return range[0] + "";
        } else {
            return range[0] + "->" + range[1];
        }
    }
}