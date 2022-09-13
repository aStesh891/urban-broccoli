package urban.broccoli.leetcode.trees;

import java.util.LinkedList;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 *
 * @author Ann Stesh
 */

public class MinimumDepthOfBinaryTree {
  
  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(7);
    TreeNode node2 = new TreeNode(15);
    TreeNode node3 = new TreeNode(20, node2, node1);
    TreeNode node4 = new TreeNode(9);
    TreeNode root = new TreeNode(3, node4, node3);
    System.out.println("result:" + minDepth(root));
  }
  
  public static int minDepth(TreeNode root) {
    if (root == null) return 0;
    
    LinkedList<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    
    int minDepth = 1;
    
    while (!nodes.isEmpty()) {
      int countOfNodes = nodes.size();
      for (int i = 0; i < countOfNodes; i++) {
        TreeNode top = nodes.remove();
        if (top.left == null && top.right == null) return minDepth;
        if (top.left != null) nodes.add(top.left);
        if (top.right != null) nodes.add(top.right);
      }
      
      minDepth++;
    }
    
    return 0;
  }
  
  
}
























