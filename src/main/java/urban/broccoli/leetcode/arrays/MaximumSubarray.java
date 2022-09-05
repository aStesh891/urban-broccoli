package urban.broccoli.leetcode.arrays;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 *
 * @author Ann Stesh
 */

public class MaximumSubarray {
  
  public static void main(String[] args) {
    int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    
    System.out.println("result:" + maxSubArray(array));
  }
  
  private static int maxSubArray(int[] nums) {  //Kadane’s Algorithm
    int maxSum = Integer.MIN_VALUE;
    int sumLocal = 0;
  
    for (int num : nums) {
      sumLocal += num;
      if (sumLocal > maxSum) maxSum = sumLocal;
      if(sumLocal < 0) sumLocal = 0;
    }
    
    return maxSum;
  }
}
