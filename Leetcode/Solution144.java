import java.util.*;

import Utils.BinaryTree;
import Utils.BinaryTree.TreeNode;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution144 {
  public static void main(String[] args) {
    Integer[] values = { 1, null, 2, 3 };
    BinaryTree tree = new BinaryTree();
    TreeNode root = tree.buildTree(values);

    System.out.println(Arrays.deepToString(preorderTraversal(root).toArray()));
  }

  static List<Integer> list = new ArrayList<>();

  public static List<Integer> preorderTraversal(TreeNode root) {
    recPreOrder(root);
    return list;
  }

  public static void recPreOrder(TreeNode root) {
    if (root == null)
      return;
    list.add(root.val);
    preorderTraversal(root.left);
    preorderTraversal(root.right);
  }

}
