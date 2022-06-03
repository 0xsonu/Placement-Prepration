import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Utils.BinaryTree;
import Utils.BinaryTree.TreeNode;

public class Solution145 {
  public static void main(String[] args) {
    Integer[] values = { 1, null, 2, 3 };
    BinaryTree tree = new BinaryTree();
    TreeNode root = tree.buildTree(values);
    System.out.println(Arrays.deepToString(postorderTraversal(root).toArray()));
  }

  static List<Integer> list = new ArrayList<>();

  public static List<Integer> postorderTraversal(TreeNode root) {
    recPostOrderTraversal(root);
    return list;
  }

  public static void recPostOrderTraversal(TreeNode root) {
    if (root == null)
      return;
    recPostOrderTraversal(root.left);
    recPostOrderTraversal(root.right);
    list.add(root.val);
  }
}
