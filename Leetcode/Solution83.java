import Utils.ListNode;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */

public class Solution83 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
    ListNode res = deleteDuplicates(head);
    while (res != null) {
      System.out.print(res.val);
      if (res.next != null) {
        System.out.print(" -> ");
      }
      res = res.next;
    }
  }

  public static ListNode deleteDuplicates(ListNode head) {
    if (head == null)
      return null;
    if (head.next == null)
      return head;
    ListNode res = head, prev = head, next = head.next;
    while (next != null) {
      if (prev.val == next.val) {
        next = next.next;
        prev.next = next;
      } else {
        prev = prev.next;
        next = next.next;
      }
    }
    return res;
  }

}
