package urban.broccoli.leetcode.general;

/**
 * Time limit per test: 1 seconds
 * Memory limit per test: 256 megabytes
 * <p>
 * You are given an array 𝑑1,𝑑2,…,𝑑𝑛 consisting of 𝑛 integers.
 * Your task is to divide this array into three parts (some of which may be empty)
 * in such a way that each element of the array belongs to exactly one of the parts,
 * and each part forms a consecutive continuous subsegment (possibly empty) of the original array.
 * <p>
 * Let the sum of the elements of the first part be 𝑠𝑢𝑚1,
 * the sum of the elements of the second part be 𝑠𝑢𝑚2,
 * and the sum of the elements of the third part be 𝑠𝑢𝑚3.
 * <p>
 * Among all possible partitions of the array, you need to choose one such that 𝑠𝑢𝑚1=𝑠𝑢𝑚3 and 𝑠𝑢𝑚1 is the largest possible.
 * <p>
 * Input data:
 * The first line of input data contains one integer 𝑛 (1≤𝑛≤2⋅105) — the number of elements of the array 𝑑.
 * The second line of input data contains 𝑛 integers 𝑑1,𝑑2,…,𝑑𝑛 (1≤𝑑𝑖≤109) — the elements of the array 𝑑.
 * <p>
 * Output data:
 * Print one integer — the maximum possible value of 𝑠𝑢𝑚1 that satisfies the condition 𝑠𝑢𝑚1=𝑠𝑢𝑚3.
 * <p>
 * Obviously, there is always at least one way to split the array in the desired way (if 𝑎=𝑐=0 and 𝑏=𝑛).
 * <p>
 * Example:: n=5
 * ai = [1 3 1 1 4] –> [5]
 *
 * @author Ann Stesh
 */

public class ThreePartsOfArray {

  public static void main(String[] args) {
    int arrayLength = 5;
    int[] array = {1, 3, 1, 1, 4};

    System.out.println("result:" + getMaxSum1(arrayLength, array));
  }

  // [0, l] = sum1; [r, arrayLength-1] = sum2
  public static int getMaxSum1(int arrayLength, int[] array) {
    int maxSum = 0;
    int sum1 = 0;
    int sum2 = 0;
    int rightBorder = arrayLength - 1;

    for (int leftBorder = 0; leftBorder < arrayLength; leftBorder++) {

      sum1 += array[leftBorder];

      while (sum1 > sum2) {
        sum2 += array[rightBorder];
        rightBorder--;
      }

      if (sum1 == sum2 && rightBorder - leftBorder >= 0) {
        maxSum = Math.max(maxSum, sum1);
      }
    }

    return maxSum;
  }

}
