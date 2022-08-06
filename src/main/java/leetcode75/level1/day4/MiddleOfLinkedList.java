package leetcode75.level1.day4;

import leetcode75.level1.day3.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfLinkedList {

  public MiddleOfLinkedList() {
    // Input: head = [1,2,3,4,5]
    // Output: [3,4,5]
    // Explanation: The middle node of the list is node 3.
  }

  public static void main(String[] args) {
    MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
    ListNode node = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode.printNode(middleOfLinkedList.middleNode(node));
  }

  public int getNodeLength(ListNode node) {
    int length = 0;
    ListNode temp = node;
    while (temp != null) {
      length++;
      temp = temp.next;
    }
    return length;
  }

  public ListNode middleNode(ListNode head) {
    int middle = getNodeLength(head) / 2;
    ListNode temp = head;
    while (middle > 0) {
      temp = temp.next;
      middle--;
    }
    head = temp;
    return head;
  }
}
