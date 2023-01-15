package urban.broccoli.leetcode.linkedlist;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * @author Ann Stesh
 */

public class ReverseLinkedList {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(1, node1);
    ListNode head = new ListNode(1, node2);
    System.out.println("result:" + reverseList(head));
  }


  public static ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
      ListNode node = current.next;
      current.next = prev;
      prev = current;
      current = node;
    }
    return prev;
  }
}
