package urban.broccoli.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string S, find the length of the longest substring without repeating characters
 * ex: "abcabcbb" -> 3; "bbbbbbbbbb" -> 1
 *
 * @author Ann Stesh
 */

public class LengthOfLongestUniqueSubstring {
  
  public static void main(String[] args) {
    String s = "dvdf";
    System.out.println("result:" + lengthOfOfLongestUniqueSubstring(s));
  }

  //Time and space complexity : O(n), n - length of the input string
  public static int lengthOfOfLongestUniqueSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int maxLength = 0;
    int start = 0;

    for (int end = 0; end < s.length(); end++) {
      char c = s.charAt(end);

      if (map.containsKey(c)) {
        start = Math.max(start, map.get(c) + 1);
      }

      maxLength = Math.max(maxLength, end - start + 1);
      map.put(c, end);
    }

    return maxLength;
  }

}
