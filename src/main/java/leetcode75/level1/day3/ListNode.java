package leetcode75.level1.day3;

public class ListNode {

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

  public static void printNode(ListNode list) {
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
