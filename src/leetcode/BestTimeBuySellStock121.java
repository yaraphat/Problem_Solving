package leetcode;

public class BestTimeBuySellStock121 {

    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int min = 10000, max = 0, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int num = prices[i];
            if (num < min) {
                min = max = num;
                continue;
            }
            if (num > max) {
                max = num;
                int profit = max - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
