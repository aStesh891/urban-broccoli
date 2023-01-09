package urban.broccoli.leetcode.trees;

import lombok.ToString;

/**
 * A valid BST is defined as follows: *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 * @author Ann Stesh
 */

@ToString
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  
  TreeNode() {
  }
  
  TreeNode(int val) {
    this.val = val;
  }
  
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
