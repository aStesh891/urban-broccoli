package urban.broccoli.leetcode.strings;

import java.util.HashMap;

/**
 * A string is good if there are no repeated characters.
 * Given a string s, return the number of good substrings of length k in s.
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 *
 * @author Ann Stesh
 */

public class SubstringsWithDistinctCharacters {
  
  public static void main(String[] args) {
    String s = "xyzzaz";
    int k = 3;

    System.out.println("result:" + countGoodSubstrings(s, k));
  }
  
  public static int countGoodSubstrings(String s, int k) {
    int count = 0;
    int leftBorder = 0;
    HashMap<Character, Integer> charToNumber = new HashMap<>();

    for (int rightBorder = 0; rightBorder < s.length(); rightBorder++) {

      Character rightChar = s.charAt(rightBorder);
      charToNumber.put(rightChar, charToNumber.getOrDefault(rightChar, 0) + 1);

      while (rightBorder - leftBorder == k) { // if k-sized window exceeded
        Character leftChar = s.charAt(leftBorder);
        if (charToNumber.get(leftChar) > 1) {
          charToNumber.put(leftChar, charToNumber.get(leftChar) - 1);
        } else {
          charToNumber.remove(leftChar);
        }
        leftBorder++;
      }

      if (charToNumber.size() == k) count++;
    }

    return count;

  }
}
