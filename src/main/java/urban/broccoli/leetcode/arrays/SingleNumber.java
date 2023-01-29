package urban.broccoli.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * @author Ann Stesh
 */

public class SingleNumber {

  public static void main(String[] args) {
    int[] prices = new int[]{4, 1, 2, 1, 2};

    System.out.println("result:" + singleNumber(prices));
  }

  //Time complexity : O(n)
  //Space complexity: O(1)
  private static int singleNumber(int[] nums) {
    int num = 0;

    for (int i : nums) {
      num = num ^ i;       //it returns the same number if we XOR with zero and return zero if we take XOR of two same numbers
    }
    return num;
  }

  private static int singleNumberHashMap(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    for (int n : nums) {
      if (map.get(n) == 1) return n;
    }
    return Integer.MAX_VALUE;
  }


  private static int singleNumberArrays(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        return nums[i];
      }
      i++;
    }
    return nums[nums.length - 1];
  }

  private static int singleNumberForce(int[] nums) {
    boolean hasDupe = false;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j] && i != j) {
          hasDupe = true;
          break;
        }
      }
      if (!hasDupe) return nums[i];
      hasDupe = false;
    }

    return Integer.MAX_VALUE;
  }
}
