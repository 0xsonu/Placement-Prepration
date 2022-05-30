import Utils.ListNode;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution203 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2,
        new ListNode(6, new ListNode(3, new ListNode(4,
            new ListNode(5, new ListNode(6)))))));
    ListNode res = removeElements(head, 6);
    while (res != null) {
      System.out.print(res.val);
      if (res.next != null) {
        System.out.print(" -> ");
      }
      res = res.next;
    }
  }

  public static ListNode removeElements(ListNode head, int val) {
    ListNode res = head;

    while (head != null) {
      if (head.val == val)
        res = head.next;
      if (head.next != null && head.next.val == val) {
        if (head.next.next != null) {
          head.next = head.next.next;
        } else
          head.next = null;
      } else {
        head = head.next;

      }
    }
    return res;
  }
}
