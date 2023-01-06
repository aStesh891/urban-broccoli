package urban.broccoli.leetcode.trees;

/**
 * Given the root node of a binary search tree and two integers low and high,
 * return the sum of values of all nodes with a value in the inclusive range [low, high].
 * <p>
 * Note: The number of nodes in the tree is in the range [1, 2 * 104].
 * 1 <= Node.val <= 105
 * 1 <= low <= high <= 105
 * All Node.val are unique.
 *
 * @author Ann Stesh
 */

public class RangeSumOfBST {

  private int rangeSum = 0;

  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(18);
    TreeNode node2 = new TreeNode(7);
    TreeNode node3 = new TreeNode(3);

    TreeNode node4 = new TreeNode(15, null, node1);
    TreeNode node5 = new TreeNode(5, node3, node2);
    TreeNode root = new TreeNode(10, node5, node4);

    System.out.println("result:" + rangeSumOfBST(root, 7, 15));
  }

  //Time complexity: O(N)- in worst case all elements might fall in range
  public static int rangeSumOfBST(TreeNode root, int low, int high) {
    if (root == null) {
      return 0;
    }

    if (root.val >= low && root.val <= high) {
      return root.val + rangeSumOfBST(root.left, low, high) + rangeSumOfBST(root.right, low, high);
    }

    if (root.val < low) {
      return rangeSumOfBST(root.right, low, high);
    }

    return rangeSumOfBST(root.left, low, high);
  }


}
























