package it.lucamicheletto.easy;

public class LC_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[currentIndex++] = nums[i];
            }
        }

        return currentIndex;
    }


    // 0 1 2 3 4 5 6 7 8 9
    // 1 2 3 1 5 2 1 3 4 1
    //             ^ i
    //           ^ currentIndex
    // 1 3 1
}
