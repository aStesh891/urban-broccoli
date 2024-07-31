package urban.broccoli.leetcode.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BalancedTeamTest {

  @Test
  public void getMaxStudentsInTeamNumber() {
    Assertions.assertEquals(3, BalancedTeam.getMaxStudentsInTeamNumber(6, new int[]{1, 10, 17, 12, 15, 2})); // team = [12,17,15]
    Assertions.assertEquals(10, BalancedTeam.getMaxStudentsInTeamNumber(10, new int[]{1337, 1337, 1337, 1337, 1337, 1337, 1337, 1337, 1337, 1337})); // can take all the students into the team because their programming skills are equal
    Assertions.assertEquals(1, BalancedTeam.getMaxStudentsInTeamNumber(6, new int[]{1, 1000, 10000, 10, 100, 1000000000}));
  }
}