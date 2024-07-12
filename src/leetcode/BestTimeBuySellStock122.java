package leetcode;

public class BestTimeBuySellStock122 {

    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 16, 40 };
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int purchasePos = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[purchasePos]) {
                purchasePos = i;
            } else if (prices[i] > prices[purchasePos]) {
                if (i == prices.length - 1 || prices[i + 1] < prices[i]) {
                    profit += prices[i] - prices[purchasePos];
                    purchasePos = i + 1;
                }
            }
        }
        return profit;
    }
}
