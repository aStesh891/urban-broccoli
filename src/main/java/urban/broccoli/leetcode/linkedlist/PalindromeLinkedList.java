package urban.broccoli.leetcode.linkedlist;

import urban.broccoli.datastructures.arraylist.ArrayList;

/**
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * @author Ann Stesh
 */

public class PalindromeLinkedList {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(1, node1);
    ListNode head = new ListNode(1, node2);
    System.out.println("result:" + isPalindrome(head));
  }

  //Time complexity : O(n), n - number of nodes in the LinkedList
  public static boolean isPalindrome(ListNode head) {
    if (head == null) return false;

    //copy to array
    ArrayList<Integer> arrayList = new ArrayList<>();
    while (head != null) {
      arrayList.add(head.val);
      head = head.next;
    }

    //two-pointer technique to check for palindrome
    int start = 0;
    int finish = arrayList.size() - 1;

    while (start < finish) {
      if (arrayList.get(start) != arrayList.get(finish)) return false;
      start++;
      finish--;
    }
    return true;
  }
}
