package urban.broccoli.leetcode.heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 * @author Ann Stesh
 */

public class TopKFrequentElements {

  public static void main(String[] args) {
    int[] array = {5,5,5,6,6,7};

    System.out.println("result:" + Arrays.toString(topKFrequent(array, 2)));
  }


/* Space complexity: O(n)
  Time complexity :
    - counting frequency O(n)
    - creating and populating the heap O(nlogn)
    - extracting top k elements O(klogn)
  So time complexity in total is O(n + nlogn + klogn) -> O(nlogn).*/
  public static int[] topKFrequent(int[] nums, int k) {
    int[] result = new int[k];
    HashMap<Integer, Integer> counter = new HashMap<>();

    for (int num: nums) {
      counter.put(num, counter.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> pqWithComparatorForMin = new PriorityQueue<>
        ((a, b) -> b.getValue().compareTo(a.getValue()));

    for (Map.Entry<Integer, Integer> map: counter.entrySet()) {
      pqWithComparatorForMin.offer(map);
    }

    for (int i = 0; i < k; i++) {
      result[i] = pqWithComparatorForMin.poll().getKey();
    }

    return result;
  }
}
