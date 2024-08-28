package urban.broccoli.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInArrayTest {

  @Test
  public void findDisappearedNumbers() {
    Assertions.assertEquals(Arrays.asList(5,6), FindAllNumbersDisappearedInArray.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    Assertions.assertEquals(List.of(2), FindAllNumbersDisappearedInArray.findDisappearedNumbers(new int[]{1,1}));
  }
}