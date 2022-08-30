package urban.broccoli.leetcode.arrays;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * <p>
 * Given n, calculate F(n).
 *
 * @author Ann Stesh
 */

public class FibonacciNumber {
  
  public static void main(String[] args) {
    int n = 15;
    System.out.println("result:" + calcFibonacciNumber(n));
  }
  
  private static int calcFibonacciNumber(int n) {
    if (n < 2) {
      return n;
    }
    return calcFibonacciNumber(n - 1) + calcFibonacciNumber(n - 2);
  }
}
