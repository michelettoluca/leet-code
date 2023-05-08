package it.lucamicheletto.easy;

public class LC_01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (target == nums[i] + nums[k]) {
                    a[0] = i;
                    a[1] = k;

                    break;
                }
            }
        }

        return a;
    }
}
