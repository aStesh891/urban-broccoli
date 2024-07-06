package urban.broccoli.leetcode.trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary search tree and an integer k,
 * return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.
 *
 * @author Ann Stesh
 */

public class TwoSumIV {
  
  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(4);
    TreeNode node5 = new TreeNode(7);
    TreeNode node3 = new TreeNode(6, null, node5);
    TreeNode node4 = new TreeNode(3, node1, node2);
    TreeNode root = new TreeNode(5, node4, node3);
    System.out.println("result:" + hasPathSum(root, 9));
  }

  //Time and space complexity: O(N)
  public static boolean hasPathSum(TreeNode root, int targetSum) {
    HashSet<Integer> secondOptions = new HashSet<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode node = queue.peek();
      if (node != null) {
        if (secondOptions.contains(targetSum - node.val)) return true;

        secondOptions.add(node.val);
        queue.add(node.left);
        queue.add(node.right);
      }

      queue.remove();
    }

    return false;
  }
  
  
}
























