package leetcode75.level1.day3;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * The number of nodes in the list is the range [0, 5000].
 * <p>
 * -5000 <= Node.val <= 5000
 * <p>
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement
 * both?
 */
public class ReverseLinkedList {

  public ReverseLinkedList() {
    // Input: head = [1,2,3,4,5]
    // Output: [5,4,3,2,1]
  }

  public static void main(String[] args) {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode list = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode reversed = reverseLinkedList.reverseList(list);
    ListNode.printNode(reversed);
    ListNode list2 = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode node = reverseLinkedList.reverse(list2);
    ListNode.printNode(node);
  }

  // recursive
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode rest = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return rest;
  }

  // iterative
  public ListNode reverse(ListNode node) {
    ListNode prev = null;
    ListNode current = node;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }
}
