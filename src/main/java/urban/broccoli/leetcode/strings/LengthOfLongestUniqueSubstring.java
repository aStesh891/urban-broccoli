package urban.broccoli.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given a string S, find the length of the longest substring without repeating characters
 * s consists of English letters, digits, symbols and spaces.
 * ex: "abcabcbb" -> 3; "bbbbbbbbbb" -> 1
 *
 * @author Ann Stesh
 */

public class LengthOfLongestUniqueSubstring {
  
  public static void main(String[] args) {
    String s = "dvdf";
    System.out.println("result:" + lengthOfOfLongestUniqueSubstring(s));
  }

  //Time complexity : O(n)
  //Space complexity: O(1) - const (sum of of English letters, digits, symbols and spaces for HashSet)
  public static int lengthOfOfLongestUniqueSubstringHashSet(String s) {
    int maxLength = 0;
    int left = 0;
    HashSet<Character> uniqueChars = new HashSet<>();

    for (int right = 0; right < s.length(); right++) {

      while (uniqueChars.contains(s.charAt(right))) {
        uniqueChars.remove(s.charAt(left));
        left++;
      }

      uniqueChars.add(s.charAt(right));

      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }

  //Time and space complexity : O(n), n - length of the input string
  public static int lengthOfOfLongestUniqueSubstring(String s) {
    int maxLength = 0;
    int start = 0;
    int end = 0;
    HashMap<Character, Integer> charToIndex = new HashMap<>();

    while (end < s.length()) {
      char ch = s.charAt(end);

      if (charToIndex.containsKey(ch) && charToIndex.get(ch) >= start) {
        start = charToIndex.get(ch) + 1;
      }

      maxLength = Math.max(maxLength, end - start + 1);
      charToIndex.put(ch, end);
      end++;
    }

    return maxLength;
  }

  public static int lengthOfOfLongestUniqueSubstringForEach(String s) {
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
