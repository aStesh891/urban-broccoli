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
  
  private static int missingNumber(int[] nums) {
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
    return 0;
  }
}
