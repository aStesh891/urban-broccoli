package urban.broccoli.leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubstringsWithDistinctCharactersTest {

  @Test
  public void countGoodSubstrings() {
    Assertions.assertEquals(1, SubstringsWithDistinctCharacters.countGoodSubstrings("xyzzaz", 3));
    Assertions.assertEquals(4, SubstringsWithDistinctCharacters.countGoodSubstrings("aababcabc", 3));
  }
}