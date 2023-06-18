package it.lucamicheletto.easy;

public class LC_258_AddDigits {
    public int addDigits(int num) {
        int sum = num;

        while (sum >= 10) {
            sum = sum(sum);
        }

        return sum;
    }

    public int sum(int num) {
        int tot = 0;

        while (num > 0) {
            tot += num % 10;
            num /= 10;
        }

        return tot;
    }
}