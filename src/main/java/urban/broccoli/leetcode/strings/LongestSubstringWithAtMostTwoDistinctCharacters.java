package urban.broccoli.leetcode.strings;

import java.util.HashMap;

/**
 * Given a string S, find the length of the longest substring that contains at most 2 distinct characters
 *
 * @author Ann Stesh
 */

public class LongestSubstringWithAtMostTwoDistinctCharacters {
  
  public static void main(String[] args) {
    String s = "ccaabbb";
    System.out.println("result:" + lengthOfLongestSubstringTwoDistinct(s));
  }

  //Time complexity : O(n)
  //Space complexity: O(2) - const
  public static int lengthOfLongestSubstringTwoDistinct(String s) {
    int maxLength = 0;
    int leftBorder = 0;
    HashMap<Character, Integer> charToNumber = new HashMap<>();

    for(int rightBorder = 0; rightBorder < s.length(); rightBorder++) {

      charToNumber.put(s.charAt(rightBorder), charToNumber.getOrDefault(s.charAt(rightBorder), 0) + 1);

      while (charToNumber.size() > 2) {
        if (charToNumber.get(s.charAt(leftBorder)) > 1) {
          charToNumber.put(s.charAt(leftBorder), charToNumber.get(s.charAt(leftBorder)) - 1);
        } else {
          charToNumber.remove(s.charAt(leftBorder));
        }
        leftBorder++;
      }

      maxLength = Math.max(maxLength, rightBorder - leftBorder + 1);
    }

    return maxLength;
  }
}
