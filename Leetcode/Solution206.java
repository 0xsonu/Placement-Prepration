/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution206 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
        new ListNode(4, new ListNode(5, new ListNode(6))))));

    ListNode res = reverseList(head);
    while (res != null) {
      System.out.print(res.val);
      if (res.next != null) {
        System.out.print(" -> ");
      }
      res = res.next;
    }
  }

  public static ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
      return head;
    ListNode newNode = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return newNode;
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
