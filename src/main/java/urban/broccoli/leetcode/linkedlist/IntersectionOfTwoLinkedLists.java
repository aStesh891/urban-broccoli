package urban.broccoli.leetcode.linkedlist;

import urban.broccoli.datastructures.arraylist.ArrayList;

import java.util.HashSet;

/**
 * Given the heads of two singly linked-lists headA and headB,
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 * @author Ann Stesh
 */

public class IntersectionOfTwoLinkedLists {

  public static void main(String[] args) {
    ListNode node01 = new ListNode(9);
    ListNode node02 = new ListNode(1, node01);
    ListNode node03 = new ListNode(2, node02);
    ListNode head01 = new ListNode(4, node03);


    ListNode node11 = new ListNode(3);
    ListNode node12 = new ListNode(2, node11);
    ListNode head02 = new ListNode(4, node12);


    System.out.println("result:" + getIntersectionNode(head01, head02));
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) return null;

    ListNode curA = headA;
    ListNode curB = headB;

    //1st - reset the pointer of one LinkedList to the head of another LinkedList after it reaches the tail node
    //2nd - move two pointers until they points to the same node
    while (curA != curB) {
      curA = (curA == null) ? headB : curA.next;
      curB = (curB == null) ? headA : curB.next;
    }

    return curB;
  }

  public static ListNode getIntersectionNodeHashSet(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) return null;

    HashSet<ListNode> hashSet = new HashSet<>();
    while (headA != null) {
      hashSet.add(headA);
      headA = headA.next;
    }

    while (headB != null) {
      if (hashSet.contains(headB)) return headB;
      headB = headB.next;
    }
    return null;
  }
}
