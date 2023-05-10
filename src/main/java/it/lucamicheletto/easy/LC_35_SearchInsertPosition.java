package it.lucamicheletto.easy;

public class LC_35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;

            } else if (nums[middle] > target) {
                right = middle - 1;

            } else {
                left = middle + 1;

            }
        }

        return left; // Questo passaggio mi è un po' oscuro, dovrei indagare
    }
}
