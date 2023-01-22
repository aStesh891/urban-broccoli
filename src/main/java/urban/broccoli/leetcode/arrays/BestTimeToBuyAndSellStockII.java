package urban.broccoli.leetcode.arrays;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * *
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 *
 * @author Ann Stesh
 */

public class BestTimeToBuyAndSellStockII {

  public static void main(String[] args) {
    int[] prices = new int[]{7, 1, 5, 3, 6, 4};

    System.out.println("result:" + maxProfit(prices));
  }

  //Time complexity : O(n), n - length of the input price array
  private static int maxProfit(int[] prices) {
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) maxProfit += prices[i] - prices[i - 1];
    }

    return maxProfit;
  }
}
