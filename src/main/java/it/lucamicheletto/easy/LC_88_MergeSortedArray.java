package it.lucamicheletto.easy;

public class LC_88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] nums = new int[m + n];

//        int i = 0;
//        int j = 0;

//        for (int k = 0; k < nums.length; k++) {
//            if (j >= n || (i < m && nums1[i] <= nums2[j])) {
//                nums[k] = nums1[i++];
//            } else if (i >= m || nums1[i] >= nums2[j]) {
//                nums[k] = nums2[j++];
//            }
//        }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0) {
            if (j >= 0 && nums1[i] <= nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }

            k--;
        }
    }
}

