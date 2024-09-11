package urban.broccoli.leetcode.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {

  @Test
  public void testTopKFrequent() {
    Assertions.assertArrayEquals(new int[]{5,6}, TopKFrequentElements.topKFrequent(new int[]{5,5,5,6,6,7}, 2));
    Assertions.assertArrayEquals(new int[]{1}, TopKFrequentElements.topKFrequent(new int[]{1}, 1));
  }
}