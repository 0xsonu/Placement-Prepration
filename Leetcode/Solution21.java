import Utils.ListNode;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution21 {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode res = mergeTwoLists(list1, list2);
    while (res != null) {
      System.out.print(res.val);
      if (res.next != null) {
        System.out.print(" -> ");
      }
      res = res.next;
    }
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;
    ListNode l = new ListNode(list1.val >= list2.val ? list2.val : list1.val);
    ListNode h = l;
    if (list1.val >= list2.val) {
      list2 = list2.next;
    } else {
      list1 = list1.next;
    }
    while (list1 != null && list2 != null) {

      if (list1.val <= list2.val) {
        l.next = new ListNode(list1.val);
        list1 = list1.next;
      } else {
        l.next = new ListNode(list2.val);
        list2 = list2.next;
      }
      l = l.next;
    }
    while (list1 != null) {
      l.next = new ListNode(list1.val);
      l = l.next;
      list1 = list1.next;
    }
    while (list2 != null) {
      l.next = new ListNode(list2.val);
      l = l.next;
      list2 = list2.next;
    }
    return h;
  }
}
