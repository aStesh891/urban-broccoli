package urban.broccoli.leetcode.trees;

import java.util.LinkedList;

/**
 * Given the root of a binary tree, return its maximum depth. *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 *
 * @author Ann Stesh
 */

public class MaximumDepthOfBinaryTree {
  
  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(7);
    TreeNode node2 = new TreeNode(15);
    TreeNode node3 = new TreeNode(20, node2, node1);
    TreeNode node4 = new TreeNode(9);
    TreeNode root = new TreeNode(3, node4, node3);
    System.out.println("result:" + maxDepth(root));
  }
  
  public static int maxDepth(TreeNode root) {
    if (root == null) return 0;
    
    LinkedList<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    
    int maxDepth = 0;
    
    while (!nodes.isEmpty()) {
      int countOfNodes = nodes.size();
      for (int i = 0; i < countOfNodes; i++) {
        TreeNode top = nodes.remove();
        if (top.left != null) nodes.add(top.left);
        if (top.right != null) nodes.add(top.right);
      }
      maxDepth++;
    }
    
    return maxDepth;
  }
  
  //Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree!
  public static int maxDepthFast(TreeNode root) {
    if (root == null) return 0;
    
    int depthLeft = maxDepthFast(root.left);
    int depthRight = maxDepthFast(root.right);
    if (depthLeft > depthRight) {
      return depthLeft + 1;
    } else
      return depthRight + 1;
  }
  
  
}
























