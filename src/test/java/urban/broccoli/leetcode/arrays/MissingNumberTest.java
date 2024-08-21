package urban.broccoli.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

  @Test
  public void missingNumber() {
    Assertions.assertEquals(2, MissingNumber.missingNumber(new int[]{3,0,1}));
    Assertions.assertEquals(2, MissingNumber.missingNumber(new int[]{0,1}));
    Assertions.assertEquals(8, MissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
  }
}