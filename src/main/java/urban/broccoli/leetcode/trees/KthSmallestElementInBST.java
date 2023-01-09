package urban.broccoli.leetcode.trees;

import java.util.Stack;

/**
 * Given the root of a binary search tree, and an integer k,
 * return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * <p>
 * Note: The number of nodes in the tree is n.
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 *
 * @author Ann Stesh
 */

public class KthSmallestElementInBST {
  
  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(4);
    TreeNode node3 = new TreeNode(1, null, node1);
    TreeNode root = new TreeNode(3, node3, node2);
    
    System.out.println("result:" + kthSmallest(root, 1));
  }

  public static int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode currentNode = root;
    int numberOfVisitedElements = 0;

    while (!stack.empty() || currentNode != null) {

      while (currentNode != null) {  //keep going left
        stack.push(currentNode);
        currentNode = currentNode.left;
      }

      currentNode = stack.pop();
      numberOfVisitedElements++;

      if (numberOfVisitedElements == k) return currentNode.val;

      currentNode = currentNode.right;
    }

    return 0;
  }


  /*// Time complexity :: O(n)
  public static int kthSmallest(TreeNode root, int k) {
    List<Integer> sortedValues = new ArrayList<>();
    inOrder(sortedValues, root);
    return sortedValues.get(k-1);
  }

  public static void inOrder(List<Integer> sortedValues, TreeNode root) {
    if (root == null) return;

    inOrder(sortedValues, root.left);
    sortedValues.add(root.val);
    inOrder(sortedValues, root.right);
  }*/
  
}
























