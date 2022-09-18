
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Utils.TreeNode;

public class Solution429 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode();
    Integer[] arr = { 1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13,
        null, null, 14 };

    root.buildTree(arr);
    System.out.println(levelOrder(root));

  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> ll = new LinkedList<>();
    if (root == null) {
      return ll;
    }
    q.add(root);
    while (!q.isEmpty()) {
      int n = q.size();
      List<Integer> current = new LinkedList<Integer>();
      for (int i = 0; i < n; i++) {
        TreeNode node = q.poll();
        current.add(node.val);
        q.addAll(node.children);
      }
      ll.add(current);
    }
    return ll;
  }
}
