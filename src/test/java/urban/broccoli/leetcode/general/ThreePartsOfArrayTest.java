package urban.broccoli.leetcode.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreePartsOfArrayTest {

  @Test
  public void getMaxSum1() {
    Assertions.assertEquals(5, ThreePartsOfArray.getMaxSum1(5, new int[]{1, 3, 1, 1, 4})); // [1,3,1],[ ],[1,4]
    Assertions.assertEquals(4, ThreePartsOfArray.getMaxSum1(5, new int[]{1, 3, 2, 1, 4})); // [1,3],[2,1],[4]
    Assertions.assertEquals(0, ThreePartsOfArray.getMaxSum1(3, new int[]{4, 1, 2})); //[ ],[4,1,2],[ ]
  }
}