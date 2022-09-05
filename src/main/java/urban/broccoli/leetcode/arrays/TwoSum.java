package urban.broccoli.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * @author Ann Stesh
 */

public class TwoSum {
  
  public static void main(String[] args) {
    int[] array = {2, 11, 7, 15};
    int target = 9;
    
    System.out.println("result:" + Arrays.toString(twoSum(array, target)));
  }
  
  private static int[] twoSum(int[] nums, int target) {
    int[] indices = new int[2];
    
    Map<Integer, Integer> numsMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int requiredNumber = target - nums[i];
      if (numsMap.containsKey(requiredNumber)) {
        indices[0] = i;
        indices[1] = numsMap.get(requiredNumber);
        break;
      }
      
      numsMap.put(nums[i], i);
    }
    
    return indices;
  }
  
  private static int[] twoSumSlow(int[] nums, int target) {
    int[] indices = new int[2];
    
    for (int i = 0; i < nums.length; i++) {
      int a = nums[i];
      for (int j = 0; j < nums.length; j++) {
        int b = nums[j];
        if (a + b == target && i != j) {
          indices[0] = i;
          indices[1] = j;
        }
      }
    }
    
    return indices;
  }
}
