package it.lucamicheletto.easy;

import java.util.Deque;

public class LC_66_PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i != 0 && digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        boolean lastIs10 = digits[0] == 10;

        if (lastIs10) {
            int[] num = new int[digits.length + 1];

            num[0] = 1;
            num[1] = 0;
            System.arraycopy(digits, 1, num, 2, num.length - 2);
            return num;
        }

        return digits;
    }
}
