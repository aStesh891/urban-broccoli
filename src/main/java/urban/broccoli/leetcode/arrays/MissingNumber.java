package urban.broccoli.leetcode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * @author Ann Stesh
 */

public class MissingNumber {
  
  public static void main(String[] args) {
    int[] array = {3, 0, 1};
    
    System.out.println("result:" + missingNumber(array));
  }

  //Runtime 0ms  Beats 100.00% !!!
  //Time complexity : O(n)
  //Space complexity: O(1)
  public static int missingNumber(int[] nums) throws IllegalArgumentException {
    int targetSum = 0;
    int realSum = 0;

    for (int target = 0; target < nums.length; target++) {
      targetSum += target + 1;
      realSum += nums[target];
    }

    return targetSum - realSum;
  }

  //Time complexity : O(n^2)
  //Space complexity: O(1)
  public static int missingNumberSimple(int[] nums) throws IllegalArgumentException {
    for (int target = 0; target < nums.length + 1; target++) {

      boolean isMissing = true;
      for (int real = 0; real < nums.length && isMissing; real++) {
        if (target == nums[real]) {
          isMissing = false;
        }
      }
      if (isMissing) return target;

    }

    throw new IllegalArgumentException("invalid input");
  }

  public static int missingNumberSorted(int[] nums) {
    Arrays.sort(nums);
  
    for (int i = 0; i < nums.length; i++) {
      if (i != nums[i]) {
        return i;
      }
    
    }
    return nums.length;
  }
  
  private static int missingNumberWithList(int[] nums) {
    List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
    
    for (int i = 0; i <= nums.length; i++) {
      if (!numsList.contains(i)) return i;
    }
    throw new IllegalArgumentException("invalid input");
  }
}
