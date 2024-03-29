package urban.broccoli.leetcode.arrays;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * @author Ann Stesh
 */

public class BestTimeToBuyAndSellStock {
  
  public static void main(String[] args) {
    int[] array = {7, 1, 5, 3, 6, 4};
    
    System.out.println("result:" + maxProfit(array));
  }
  
  private static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    
    for (int price : prices) {
      if (price < minPrice) minPrice = price;
      
      if (price - minPrice > maxProfit) {
        maxProfit = price - minPrice;
      }
    }
    
    return maxProfit;
  }
}
