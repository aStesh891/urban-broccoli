package urban.broccoli.leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithAtMostTwoDistinctCharactersTest {

  @Test
  public void lengthOfLongestSubstringTwoDistinct() {
    Assertions.assertEquals(3, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("eceba"));
    Assertions.assertEquals(5, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
  }
}