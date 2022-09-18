import java.util.*;

import Utils.BinaryTree;
import Utils.BinaryTree.TreeNode;

public class Solution637 {
  public static void main(String[] args) {
    Integer[] values = { 3, 9, null, null, 20, 15, null, null, 7, null, null };
    BinaryTree tree = new BinaryTree();
    TreeNode root = tree.buildTree(values);

    System.out.println(Arrays.deepToString(levelOrder(root).toArray()));
  }

  public static List<Double> levelOrder(TreeNode root) {
    List<Double> list = new ArrayList<>();
    if (root == null)
      return list;
    Queue<TreeNode> q = new LinkedList<>();
    double sum = 0;
    double count = 0;
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      TreeNode current = q.remove();
      if (current == null) {
        list.add(sum / count);
        sum = 0;
        count = 0;
        if (q.isEmpty())
          break;
        else
          q.add(null);
      } else {
        // l.add(current.val);
        sum += current.val;
        count++;
        if (current.left != null)
          q.add(current.left);
        if (current.right != null)
          q.add(current.right);
      }
    }
    return list;
  }

}
