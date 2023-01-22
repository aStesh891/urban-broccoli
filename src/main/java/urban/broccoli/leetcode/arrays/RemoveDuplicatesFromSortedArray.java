package urban.broccoli.leetcode.arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * @author Ann Stesh
 */

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    System.out.println("result:" + removeDuplicates(nums));
  }

  private static int removeDuplicates(int[] nums) {
    int insertIndex = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[insertIndex] = nums[i];
        insertIndex++;
      }
    }

    return insertIndex;
  }
}
