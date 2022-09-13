package urban.broccoli.leetcode.trees;

/**
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * <p>
 * A leaf is a node with no children.
 *
 * @author Ann Stesh
 */

public class PathSum {
  
  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(7);
    TreeNode node2 = new TreeNode(15);
    TreeNode node3 = new TreeNode(20, node2, node1);
    TreeNode node4 = new TreeNode(9);
    TreeNode root = new TreeNode(3, node4, node3);
    System.out.println("result:" + hasPathSum(root, 38));
  }
  
  public static boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    
    if (root.val == targetSum && root.left == null && root.right == null) return true;
    
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
  }
  
  
}
























