import java.util.Stack;

import Utils.ListNode;

public class Solution234 {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
    System.out.println(isPalindrome(list1));
  }

  public static boolean isPalindrome(ListNode head) {
    ListNode temp = head;
    Stack<Integer> stack = new Stack<>();

    while (head != null) {
      stack.push(head.val);
      head = head.next;
    }
    while (!stack.isEmpty() || temp != null) {
      if (stack.pop() != temp.val)
        return false;
      temp = temp.next;
    }

    return true;
  }
}
