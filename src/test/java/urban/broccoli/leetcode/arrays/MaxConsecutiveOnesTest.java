package urban.broccoli.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

  @Test
  public void findMaxConsecutiveOnes() {
    Assertions.assertEquals(3, MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    Assertions.assertEquals(2, MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    Assertions.assertEquals(2, MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1}));
  }
}