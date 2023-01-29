package urban.broccoli.leetcode.arrays;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * <p>
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 *
 * @author Ann Stesh
 */

public class PlusOne {

  public static void main(String[] args) {
    int[] digits = new int[]{9};

    System.out.println("result:" + Arrays.toString(plusOne(digits)));
  }

  //Time complexity : O(n)
  //Space complexity: O(1)
  private static int[] plusOne(int[] digits) {
    if (digits == null) return null;

    for (int i = digits.length - 1; i >= 0; i--) {
      if(digits[i] < 9) {
        digits[i]++;
        return digits;
      }

      digits[i] = 0;
    }

    //if all number inside array are 9 -> it will become [0,0,0,0]
    int[] plusOneArray = new int[digits.length + 1];
    plusOneArray[0] = 1;
    return plusOneArray;
  }
}
