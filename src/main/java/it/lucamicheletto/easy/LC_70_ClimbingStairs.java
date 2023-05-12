package it.lucamicheletto.easy;

public class LC_70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int x = 1;
        int y = 2;
        for (int i = 2; i < n; i++) {
            int temp = x;
            x = y;
            y = temp + y;
        }
        return y;
    }
}
