package it.lucamicheletto.easy;

import java.util.HashMap;
import java.util.Map;

public class LC_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ele = nums[0];

        for (int num : nums) {

            if (num == ele) {
                count++;
            } else {
                count--;
            }


            if (count == 0) {
                ele = num;
                count = 1;
            }
        }

        return ele;
    }
}
