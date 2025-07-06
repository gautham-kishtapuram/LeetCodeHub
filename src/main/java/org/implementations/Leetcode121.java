package org.implementations;

public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }

        return maxProfit;
    }

    public int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if ((prices[i] - buy) > maxProfit) {
                maxProfit = prices[i] - buy;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Leetcode121 leetcode121 = new Leetcode121();
        int result = leetcode121.maxProfit1(new int[]{2, 3, 4, 1, 2, 6, 10});
        System.out.println(result);
    }

}
