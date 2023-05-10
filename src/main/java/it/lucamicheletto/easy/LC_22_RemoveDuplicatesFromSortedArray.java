package it.lucamicheletto.easy;

public class LC_22_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int currentIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[currentIndex] != nums[i + 1]) {
                nums[++currentIndex] = nums[i + 1];
            }
        }

        return currentIndex + 1;
    }
}
