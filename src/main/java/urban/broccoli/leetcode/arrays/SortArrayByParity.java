package urban.broccoli.leetcode.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers. *
 * Return any array that satisfies this condition.
 *
 * @author Ann Stesh
 */

public class SortArrayByParity {
  
  public static void main(String[] args) {
    Integer[] array = {42, 5, -19, 8, 1, -11, 3, 6, 7, 2, 4};
    
    System.out.println("result:" + Arrays.toString(sortArray(array)));
    System.out.println("result with streams:" + Arrays.toString(sortArrayWithStreams(array)));
  }
  
  private static Integer[] sortArray(Integer[] array) {
    Integer[] sorted = new Integer[array.length];
    int iterator = 0;
    
    for (Integer element : array) {
      if (element % 2 == 0) {
        sorted[iterator] = element;
        iterator++;
      }
    }
    for (Integer element : array) {
      if (element % 2 != 0) {
        sorted[iterator] = element;
        iterator++;
      }
    }
    return sorted;
  }
  
  private static Integer[] sortArrayWithStreams(Integer[] array) {
    int arraySize = array.length;   //variable used in lambda expression should be final or effectively final
    array = Stream.of(array).sorted((a, b) -> {
      // if a is even and b is odd, a should be placed before b
      if (a % 2 == 0)
        return -1;
      
      // if b is even and a is odd, b should be placed before a
      return 0;
    }).toArray(size -> new Integer[arraySize]);
    
    return array;
  }
  
}