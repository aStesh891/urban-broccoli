package urban.broccoli.leetcode.arrays;

/**
 * Given a binary array nums and an integer k,
 * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 *
 * @author Ann Stesh
 */

public class MaxConsecutiveOnesWithFlip {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
    int k = 2;

    System.out.println("result:" + longestOnes(nums, k));
  }

  //Time complexity : O(n)
  //Space complexity: O(1)
  public static int longestOnes(int[] nums, int k) {
    int maxLength = 0;
    int right = 0;
    int left = 0;
    int zeroCount = 0;

    while (right < nums.length) {
      if (nums[right] == 0) zeroCount++;

      //if zero_count exceeds k - decrease the window size by shifting the left end to the right side
      while (zeroCount > k) {

        if (nums[left] == 0) {
          zeroCount--;
        }
        left++;

      }

      maxLength = Math.max(maxLength, right - left + 1);
      right++;
    }

    return maxLength;
  }
}
