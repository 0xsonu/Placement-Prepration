package CodingNinja;

class Node {
  public int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

public class FoldAndMergeLinkedList {
  public static void main(String[] args) {
    Node head = new Node(7, new Node(2, new Node(9, new Node(2, new Node(-1)))));
    Node res = foldAndMerge(head);
    while (res != null) {
      System.out.print(res.data);
      if (res.next != null) {
        System.out.print(" -> ");
      }
      res = res.next;
    }
  }

  public static Node foldAndMerge(Node head) {

    Node fast = head, prev = null, next = null;
    while (fast.next != null) {
      fast = fast.next.next;
      next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }

    Node ans = head;
    while (prev != null) {
      head.data *= prev.data;
      head = head.next;
      prev = prev.next;
    }

    return ans;
  }

}
