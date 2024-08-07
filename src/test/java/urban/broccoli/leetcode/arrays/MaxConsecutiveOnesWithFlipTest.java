package urban.broccoli.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesWithFlipTest {

  @Test
  public void longestOnes() {
    Assertions.assertEquals(6, MaxConsecutiveOnesWithFlip.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));  //  result: [1,1,1,0,0,1,1,1,1,1,1]
    Assertions.assertEquals(10, MaxConsecutiveOnesWithFlip.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
  }
}