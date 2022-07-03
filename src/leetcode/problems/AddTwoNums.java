package leetcode.problems;

public class AddTwoNums {
  public AddTwoNums() {}

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int num1 = l1.val;
    l1.val = l1.next.val;
    l1.next = l1.next.next;
    int i = 1;
    while (l1.next != null) {
      num1 += (Math.pow(10, i++) * l1.val);
      l1.val = l1.next.val;
      l1.next = l1.next.next;
    }
    System.out.println("l1: " + num1);
    return new ListNode();
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    AddTwoNums addTwoNums = new AddTwoNums();
    ListNode node = addTwoNums.addTwoNumbers(l1, l2);
    for (int i = 0; i < 3; i++) {
      System.out.print(node.val + " , ");
      if (i == 2) {
        continue;
      }
      node.val = node.next.val;
      node.next = node.next.next;
    }
  }
}


// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
