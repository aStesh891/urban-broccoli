package urban.broccoli.leetcode.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooksTest {

  @Test
  public void getMaxBooksNumber() {
    Assertions.assertEquals(3, Books.getMaxBooksNumber(4, 5, new int[]{3, 1, 2, 1}));
    Assertions.assertEquals(2, Books.getMaxBooksNumber(3, 2, new int[]{2, 1, 1}));
    Assertions.assertEquals(1, Books.getMaxBooksNumber(3, 3, new int[]{2, 2, 3}));
    Assertions.assertEquals(1, Books.getMaxBooksNumber(5, 2, new int[]{5, 1, 4, 1, 4})); //first read book number i, then book number i + 1, then book number i + 2, and so on
  }
}