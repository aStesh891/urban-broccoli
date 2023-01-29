package urban.broccoli.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * @author Ann Stesh
 */

public class IntersectionOfTwoArraysII {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 2, 1};
    int[] nums2 = new int[]{2, 2};

    System.out.println("result:" + Arrays.toString(intersectSorted(nums1, nums2)));
  }

  //Time complexity : O(N + M) - O(N) for iterate one of the array to create a hashmap and O(M) to iterate the other array
  //Space complexity: O(N) - store hashmap
  private static int[] intersectHashMap(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    for (int n : nums1) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    for (int n : nums2) {
      if (map.get(n) != null && map.get(n) > 0) {
        map.put(n, map.get(n) - 1);
        list.add(n);
      }
    }

    int[] intersectedList = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      intersectedList[i] = list.get(i);
    }
    return intersectedList;
  }

  //Time complexity : O(max(N, M))
  //Space complexity: O(N)
  private static int[] intersectSorted(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    List<Integer> list = new ArrayList<>();
    int i = 0;
    int j = 0;

    while (i != nums1.length && j != nums2.length) {
      if (nums1[i] == nums2[j]) {
        list.add(nums1[i]);
        j++;
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      }
    }

    int[] intersectedList = new int[list.size()];
    for (int n = 0; n < list.size(); n++) {
      intersectedList[n] = list.get(n);
    }
    return intersectedList;
  }
}
