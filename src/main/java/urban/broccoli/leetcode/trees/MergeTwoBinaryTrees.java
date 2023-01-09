package urban.broccoli.leetcode.trees;

/**
 * You are given two binary trees root1 and root2.
 * Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 * You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of the new tree.
 *
 * Return the merged tree.
 * <p>
 * Note: The merging process must start from the root nodes of both trees.
 *
 * @author Ann Stesh
 */

public class MergeTwoBinaryTrees {
  
  public static void main(String[] args) {
    TreeNode node01 = new TreeNode(5);
    TreeNode node02 = new TreeNode(2);
    TreeNode node03 = new TreeNode(3, node01, null);
    TreeNode root01 = new TreeNode(1, node03, node02);

    TreeNode node1 = new TreeNode(4);
    TreeNode node2 = new TreeNode(7);
    TreeNode node3 = new TreeNode(1, null, node1);
    TreeNode node4 = new TreeNode(3, null, node2);
    TreeNode root2 = new TreeNode(2, node3, node4);
    
    System.out.println("result:" + mergeTrees(root01, root2).toString());
  }

  //Time complexity : O(m)- a total of m nodes need to be traversed
  //Runtime 0 ms - beats 100%
  public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) return null;
    if (root1 != null && root2 == null) return root1;
    if (root1 == null && root2 != null) return root2;

    TreeNode left = mergeTrees(root1.left, root2.left);
    TreeNode right = mergeTrees(root1.right, root2.right);

    return new TreeNode(root1.val + root2.val, left, right);
  }
  
  
}
























