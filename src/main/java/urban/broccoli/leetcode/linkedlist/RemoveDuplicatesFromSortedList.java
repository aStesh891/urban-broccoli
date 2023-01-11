package urban.broccoli.leetcode.linkedlist;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * @author Ann Stesh
 */

public class RemoveDuplicatesFromSortedList {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(1, node1);
    ListNode head = new ListNode(1, node2);
    System.out.println("result:" + deleteDuplicates(head).toString());
  }

  public static ListNode deleteDuplicates(ListNode head) {
    if (head == null) return head;

    ListNode currentNode = head;

    while (currentNode.next != null) {
      if (currentNode.val == currentNode.next.val) {
        currentNode.next = currentNode.next.next;
      } else {
        currentNode = currentNode.next;
      }
    }

    return head;
  }


  public static ListNode deleteDuplicatesRecursive(ListNode head) {
    if (head == null || head.next == null) return head;
    head.next = deleteDuplicates(head.next);
    return (head.val == head.next.val) ? head.next : head;
  }
}
