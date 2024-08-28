package urban.broccoli.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * @author Ann Stesh
 */

public class FindAllNumbersDisappearedInArray {

  public static void main(String[] args) {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    //int[] nums = {1,1};

    System.out.println("result:" + findDisappearedNumbers(nums));
  }

  // e.g. input: [4, 3, 2, 7, 8, 2, 3, 1] -> becomes: [-4, -3, -2, -7, 8, 2, -3, -1]
  public static List<Integer> findDisappearedNumbers(int[] nums) {

    System.out.println("nums:" + Arrays.toString(nums));
    // walk through all elements in the array, we can use the current element as an index and flag its value
    for (int i : nums) {
      System.out.println("i:" + i + ", abs:" + Math.abs(i));
      int index = Math.abs(i);

      if (nums[index - 1] > 0) {
        //all numbers are > 0, so we can use a negative number
        nums[index - 1] *= -1;
      }

    }

    List<Integer> missingNums = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) missingNums.add(i + 1);
    }
    return missingNums;
  }

  private static List<Integer> findDisappearedNumbersWithCheckArray(int[] nums) {
    boolean[] checkedNums = new boolean[nums.length];

    for (int num : nums) {
      checkedNums[num - 1] = true;
    }

    List<Integer> missingNums = new ArrayList<>();
    for (int i = 0; i < checkedNums.length; i++) {
      if (!checkedNums[i]) missingNums.add(i + 1);
    }
    return missingNums;
  }

}
