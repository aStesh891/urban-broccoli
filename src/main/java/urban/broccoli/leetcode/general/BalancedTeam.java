package urban.broccoli.leetcode.general;

import java.util.Arrays;

/**
 * Time limit per test: 2 seconds
 * Memory limit per test: 256 megabytes
 * <p>
 * You are a university coach. There are 𝑛-students under your supervision at the university,
 * and the programming skill of the 𝑖-th student is 𝑎𝑖.
 * You want to put together a team for a new programming competition. As you know, the more students there are in the competition,
 * the more chances you have to win! Therefore, you want to put together a team with the largest possible number of students.
 * But you also know that the team should be balanced.
 * This means that the programming skills of each pair of students in the team should differ by no more than 5.
 * <p>
 * The task is to find the maximum possible number of students in a balanced team.
 * <p>
 * Input:
 * The first line of the input data contains one integer 𝑛 (1≤𝑛≤2⋅105) — the number of students.
 * The second line of input contains 𝑛 integers 𝑎1,𝑎2,…,𝑎𝑛 (1≤𝑎𝑖≤109), where 𝑎𝑖 is the programming skill of the 𝑖-th student.
 * <p>
 * Output
 * Print a single integer — the maximum possible number of students in a balanced team.
 * <p>
 * Example:: n=6
 * ai = [1 10 17 12 15 2] –> [3]
 *
 * @author Ann Stesh
 */

public class BalancedTeam {

  public static void main(String[] args) {
    int students = 6;
    int[] studentSkill = {1, 10, 17, 12, 15, 2};

    System.out.println("result:" + getMaxStudentsInTeamNumber(students, studentSkill));
  }

  public static int getMaxStudentsInTeamNumber(int students, int[] studentSkill) {
    int maxNumber = 0;
    int localNumber = 0;
    int leftBorder = 0;

    Arrays.sort(studentSkill);

    for (int rightBorder = 0; rightBorder < students; rightBorder++) {
      localNumber ++;

      while (studentSkill[rightBorder] - studentSkill[leftBorder] > 5) {
        localNumber--;
        leftBorder++;
      }

      maxNumber = Math.max(maxNumber, localNumber);
    }

    return maxNumber;
  }

}
