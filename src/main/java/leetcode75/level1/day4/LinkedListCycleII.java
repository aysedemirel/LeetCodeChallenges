package leetcode75.level1.day4;

import leetcode75.level1.day3.ListNode;

/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle,
 * return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by
 * continuously following the next pointer. Internally, pos is used to denote the index of the node
 * that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that
 * pos is not passed as a parameter.
 * <p>
 * Do not modify the linked list.
 * <p>
 * Can you solve it using O(1) (i.e. constant) memory?
 */
public class LinkedListCycleII {

  public LinkedListCycleII() {
    // Input: head = [3,2,0,-4], pos = 1
    // Output: tail connects to node index 1
    // Explanation: There is a cycle in the linked list, where tail connects to the second node.
  }

  public static void main(String[] args) {
    LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
    ListNode node = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
    linkedListCycleII.detectCycle(node);
  }

  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    if (fast == null || fast.next == null) {
      return null;
    }
    while (head != slow) {
      head = head.next;
      slow = slow.next;
    }
    return head;
  }
}
