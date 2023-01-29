package urban.broccoli.leetcode.arrays;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * @author Ann Stesh
 */

public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] prices = new int[]{1, 2, 3, 1};

    System.out.println("result:" + containsDuplicate(prices));
  }

  //Time complexity : O(n)
  //Space complexity: O(n)
  private static boolean containsDuplicate(int[] nums) {
    if (nums == null || nums.length == 0) return false;

    HashSet<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (set.contains(n)) return true;
      set.add(n);
    }

    return false;
  }
}
