package Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
  public int val;
  public List<TreeNode> children;

  public TreeNode() {
    this.children = new ArrayList<TreeNode>();
  }

  public TreeNode(int val) {
    this.val = val;
    this.children = new ArrayList<TreeNode>();

  }

  public TreeNode(int val, List<TreeNode> children) {
    this.val = val;
    this.children = children;
  }

  public void buildTree(Integer[] q) {
    this.val = q[0];
    TreeNode head = this;
    List<TreeNode> c = new ArrayList<>();
    Queue<TreeNode> levelNode = new LinkedList<>();
    for (int i = 2; i < q.length; i++) {
      Integer curr = q[i];
      if (curr == null) {
        head.children = c;
        c = new ArrayList<>();
        head = levelNode.remove();
      } else {
        TreeNode tempNode = new TreeNode(curr);
        c.add(tempNode);
        levelNode.add(tempNode);
      }
    }
  }

}
