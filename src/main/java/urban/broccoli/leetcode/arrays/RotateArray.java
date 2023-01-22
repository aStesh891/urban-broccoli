package urban.broccoli.leetcode.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * @author Ann Stesh
 */

public class RotateArray {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    int k = 12;

    System.out.println("result:" + Arrays.toString(rotate(nums, k)));
  }

  //Time complexity : O(n)
  private static int[] rotate(int[] nums, int k) {
    k = k % nums.length;  // middle pointer

    //reverse the array
    swap(nums, 0, nums.length - 1);

    //split the array into two and reverse both the two parts
    swap(nums, 0, k - 1);
    swap(nums, k, nums.length - 1);

    return nums;
  }


  private static void swap(int[] array, int start, int end) {
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }


  }
}
