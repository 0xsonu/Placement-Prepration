import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Utils.BinaryTree;
import Utils.BinaryTree.*;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution94 {
  public static void main(String[] args) {
    Integer[] values = { 1, null, 2, 3 };
    BinaryTree tree = new BinaryTree();
    TreeNode root = tree.buildTree(values);

    System.out.println(Arrays.deepToString(inorderTraversal(root).toArray()));
  }

  static List<Integer> list = new ArrayList<>();

  public static List<Integer> inorderTraversal(TreeNode root) {
    recInorderTraversal(root);
    return list;
  }

  public static void recInorderTraversal(TreeNode root) {
    if (root == null)
      return;
    recInorderTraversal(root.left);
    list.add(root.val);
    recInorderTraversal(root.right);

  }
}
