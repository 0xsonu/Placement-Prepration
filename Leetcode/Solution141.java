/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution141 {
  public static void main(String[] args) {
    ListNode head = new ListNode(3);
    ListNode last = new ListNode(-4);
    ListNode next = new ListNode(2, new ListNode(0, last));
    head.next = next;
    last.next = next;
    System.out.println(hasCycle(head));
  }

  public static boolean hasCycle(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow)
        return true;
    }
    return false;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    this.val = x;
    this.next = null;
  }

  ListNode(int x, ListNode node) {
    this.val = x;
    this.next = node;
  }
}
