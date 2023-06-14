package it.lucamicheletto.easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < minBuy) {
                minBuy = price;
            }

            int diff = price - minBuy;

            if (diff > profit) profit = diff;
        }

        return profit;
    }
}