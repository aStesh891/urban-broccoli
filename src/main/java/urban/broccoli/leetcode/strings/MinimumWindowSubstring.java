package urban.broccoli.leetcode.strings;

import java.util.HashMap;

/**
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring
 * of s such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 * s and t consist of uppercase and lowercase English letters.
 *
 * @author Ann Stesh
 */

public class MinimumWindowSubstring {

  public static void main(String[] args) {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    System.out.println("result:" + minWindow(s, t));
  }

  //Time complexity : O(s.length()) - O(1) - algorithm iterates through the string once, and each iteration involves constant time operations
  //Space complexity: O(t.length()) - O(1) - we use space for the HashMap to store characters from t
  public static String minWindow(String s, String t) {
    //create a map to store the count of characters in string t
    HashMap<Character, Integer> tCharsToCount = new HashMap<>();
    for (char ch: t.toCharArray()) {
      tCharsToCount.put(ch, tCharsToCount.getOrDefault(ch, 0 ) + 1);
    }

    int windowStart = 0;
    int windowEnd = Integer.MAX_VALUE;

    int unmatched = tCharsToCount.size();
    int left = 0;

    for (int right = 0; right < s.length(); right++) {
      char rightCh = s.charAt(right);

      //decrement count of the current character in the map
      tCharsToCount.put(rightCh, tCharsToCount.getOrDefault(rightCh, 0) - 1);

      //if it becomes 0, decrement the count variable (could be -1 etc)
      if (tCharsToCount.get(rightCh) == 0) {
        tCharsToCount.remove(rightCh);
        unmatched--;
      }

      //move pointer 'left' to check if it is possible to remove more characters and get smaller substrings
      while (unmatched == 0) {

        //store the smaller length in windowEnd and update the start variable
        if (windowEnd > right - left + 1) {
          windowEnd = right - left + 1;
          windowStart = left;
        }

        //add the current element to the map
        char leftCh = s.charAt(left);
        tCharsToCount.put(leftCh, tCharsToCount.getOrDefault(leftCh, 0) + 1);

        //increment the count if it becomes greater than 0
        if (tCharsToCount.get(leftCh) > 0) unmatched++;

        left++;
      }

    }

    return (windowEnd == Integer.MAX_VALUE)? "" : s.substring(windowStart, windowStart + windowEnd);
  }

}
