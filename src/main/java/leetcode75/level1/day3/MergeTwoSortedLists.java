package leetcode75.level1.day3;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes
 * of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * <p>
 * -100 <= Node.val <= 100
 * <p>
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {

  public MergeTwoSortedLists() {
    // Input: list1 = [1,2,4], list2 = [1,3,4]
    // Output: [1,1,2,3,4,4]
  }

  public static void main(String[] args) {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    mergeTwoSortedLists.mergeTwoLists(list1, list2);
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    ListNode output = null;
    if (list1.val < list2.val) {
      output = list1;
      list1 = list1.next;
    } else {
      output = list2;
      list2 = list2.next;
    }
    // store the reference to the last element in output.
    ListNode temp = output;
    while (list1 != null && list2 != null) {
      if (list1.val > list2.val) {
        temp.next = list2;
        list2 = list2.next;
      } else {
        temp.next = list1;
        list1 = list1.next;
      }
      temp = temp.next;
    }
    if (list1 != null) {
      temp.next = list1;
    }
    if (list2 != null) {
      temp.next = list2;
    }
    //printNode(output);
    return output;
  }

  public void printNode(ListNode list) {
    while (true) {
      System.out.print(list.val + " ");
      if (list.next == null) {
        System.out.println(" ");
        break;
      }
      ListNode node = list.next;
      list.val = node.val;
      if (list.next.next == null) {
        System.out.println(list.val + " ");
        break;
      }
      list.next = list.next.next;
    }
  }

}

class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
