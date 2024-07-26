package urban.broccoli.leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLongestUniqueSubstringTest {

  @Test
  public void lengthOfOfLongestUniqueSubstring() {
    Assertions.assertEquals(3, LengthOfLongestUniqueSubstring.lengthOfOfLongestUniqueSubstring("abcabcbb"));
    Assertions.assertEquals(1, LengthOfLongestUniqueSubstring.lengthOfOfLongestUniqueSubstring("bbbbb"));
    Assertions.assertEquals(3, LengthOfLongestUniqueSubstring.lengthOfOfLongestUniqueSubstring("pwwkew"));
  }
}