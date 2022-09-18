
import Utils.BinaryTree;
import Utils.BinaryTree.TreeNode;

public class Solution98 {
  public static void main(String[] args) {
    // Integer[] values = { 3, 9, null, null, 20, 15, null, null, 7, null, null };
    Integer[] values = { 1, null, 1 };
    BinaryTree tree = new BinaryTree();
    TreeNode root = tree.buildTree(values);
    System.out.println(isValidBST(root));
  }

  public static boolean isValidBST(TreeNode root) {
    return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private static boolean isValid(TreeNode node, long l, long h) {
    if (node == null)
      return true;
    return node.val > l && node.val < h && isValid(node.left, l, node.val) && isValid(node.right, node.val, h);
  }
}
