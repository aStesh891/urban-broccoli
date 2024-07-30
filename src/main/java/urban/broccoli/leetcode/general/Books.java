package urban.broccoli.leetcode.general;

/**
 * Time limit per test: 2 seconds
 * Memory limit per test: 256 megabytes
 * <p>
 * When Valera has free time, he goes to the library and reads books.
 * Today he had t free minutes to read. So Valera took n books from the library and estimated how much time it would take to read each book.
 * Let's number the books with integers from 1 to n. Valera needs ai minutes to read the i-th book.
 * <p>
 * Valera decided that he would choose a random book with number i and would read the books one after another,
 * starting with this book. In other words, he would first read book number i, then book number i + 1, then book number i + 2, and so on.
 * He continues this process until either his free time runs out or he reads book number n.
 * Valera reads each book in its entirety, that is, he does not read a book that he does not have time to finish due to lack of free time.
 * <p>
 * Calculate the maximum number of books that Valera can read.
 * <p>
 * Input data:
 * The first line contains two integers n and t (1≤n≤105; 1≤t≤109) — the number of books and the number of free minutes Valera has.
 * The second line contains a sequence of n integers a1, a2, ..., an (1≤ai≤104), where the number ai denotes the number of minutes needed to read the i-th book.
 * <p>
 * Output data:
 * Print a single integer — the maximum number of books Valera can read.
 * <p>
 * Example:: n=4, t=5
 * ai = [3 1 2 1] –> [3]
 *
 * @author Ann Stesh
 */

public class Books {

  public static void main(String[] args) {
    int books = 4;
    int time = 5;
    int[] booksReadTime = {3, 1, 2, 1};

    System.out.println("result:" + getMaxBooksNumber(books, time, booksReadTime));
  }

  public static int getMaxBooksNumber(int books, int time, int[] booksReadTime) {
    int maxSum = 0;
    int sumLocal = 0;
    int leftBorder = 0;

    for (int rightBorder = 0; rightBorder < books; rightBorder++) {
      sumLocal += booksReadTime[rightBorder];

      while (sumLocal > time) {
        sumLocal -= booksReadTime[leftBorder];
        leftBorder++;
      }

      maxSum = Math.max(maxSum, rightBorder - leftBorder + 1);
    }

    return maxSum;
  }

}
