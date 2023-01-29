package urban.broccoli.leetcode.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * @author Ann Stesh
 */

public class MoveZeroes {
  
  public static void main(String[] args) {
    int[] array = {42, 0, 0, 8, 1, 0, 0, 6, 7, 0, 4};
    
    System.out.println("result:" + Arrays.toString(moveZeroesSnowBall(array)));
  }

  //Time complexity : O(n)
  //Space complexity: O(1) - only swap elements on the existing array in-place
  private static int[] moveZeroes(int[] nums) {
    boolean unSorted = true;
    
    while (unSorted) {
      unSorted = false;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0 && i != nums.length - 1 && nums[i + 1] != 0) {
          int newElement = nums[i + 1];
          nums[i + 1] = nums[i];
          nums[i] = newElement;
          unSorted = true;
        }
      }
    }
    
    return nums;
  }

  //Time complexity : O(n)
  //Space complexity: O(1) - only swap elements on the existing array in-place
  private static int[] moveZeroesSnowBall(int[] nums) {
    int snowBallSize = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        snowBallSize++;
      } else if (snowBallSize > 0) {
        nums[i - snowBallSize] = nums[i];
        nums[i] = 0;
      }
    }

    return nums;
  }
}
