package urban.broccoli.leetcode.linkedlist;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it. *
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * @author Ann Stesh
 */

public class LinkedListCycle {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(1, node1);
    ListNode head = new ListNode(1, node2);
    System.out.println("result:" + hasCycle(head));
  }

  public static boolean hasCycle(ListNode head) {
    if (head == null) return false;
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) return true;
    }

    return false;
  }
}
