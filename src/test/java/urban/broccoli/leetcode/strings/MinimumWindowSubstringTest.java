package urban.broccoli.leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

  @Test
  public void minWindow() {
    Assertions.assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    Assertions.assertEquals("a", MinimumWindowSubstring.minWindow("a", "a"));
    Assertions.assertEquals("", MinimumWindowSubstring.minWindow("a", "aa"));
  }
}