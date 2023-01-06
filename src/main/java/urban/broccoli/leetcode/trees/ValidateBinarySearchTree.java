package urban.broccoli.leetcode.trees;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 * Constraints: *
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 * @author Ann Stesh
 */

public class ValidateBinarySearchTree {
  
  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(3);
    TreeNode node2 = new TreeNode(7);

    TreeNode node3 = new TreeNode(6, node1, node2);
    TreeNode node4 = new TreeNode(4, null, null);
    TreeNode root = new TreeNode(5, node4, node3);
    System.out.println("result:" + validateBinarySearchTree(root));
  }
  
  public static boolean validateBinarySearchTree(TreeNode root) {
    if (root == null) return true;

    //if (root.left == null && root.right == null) return true;

    if ((root.left != null && root.val >= root.left.val) || (root.right != null && root.val <= root.right.val)) return false;

    return validateBinarySearchTree(root.left) && validateBinarySearchTree(root.right);
  }

  //time complexity : O(N) -  visit each node once
  public static boolean validateBinarySearchTree(TreeNode root, Integer low, Integer high) {
    if (root == null) return true;

    if ((high != null && root.val >= high) || (low != null && root.val <= low)) return false;

    return validateBinarySearchTree(root.left, low, root.val) && validateBinarySearchTree(root.right, root.val, high);
  }
}
























