package urban.broccoli.leetcode.linkedlist;

import urban.broccoli.datastructures.arraylist.ArrayList;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * @author Ann Stesh
 */

public class MiddleOfLinkedList {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(1, node1);
    ListNode head = new ListNode(1, node2);
    System.out.println("result:" + middleNode(head));
  }

  //Time complexity : O(n), n - number of nodes in the LinkedList
  public static ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) return head;

    ArrayList<ListNode> arrayList = new ArrayList<>();

    ListNode current = head;
    while (current != null) {
      arrayList.add(current);
      current = current.next;
    }

    int midIndex;
    if (arrayList.size() % 2 == 0) {
      midIndex = arrayList.size() / 2;
    } else {
      midIndex = (arrayList.size() - 1) / 2;
    }

    return (ListNode) arrayList.get(midIndex);
  }
}
