package urban.broccoli.leetcode.arrays;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * @author Ann Stesh
 */

public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 1, 0, 1};

    System.out.println("result:" + findMaxConsecutiveOnes(nums));
  }

  //Time complexity : O(n)
  //Space complexity: O(1)
  public static int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int sum = 0;

    for (int num : nums) {
      if (num == 1) {
        sum++;
      } else {
        sum = 0;
      }
      max = Math.max(max, sum);
    }

    return max;
  }
}
