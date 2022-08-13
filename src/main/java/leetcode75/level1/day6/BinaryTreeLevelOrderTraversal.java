package leetcode75.level1.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e.,
 * from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {

  public BinaryTreeLevelOrderTraversal() {
    // Input: root = [3,9,20,null,null,15,7]
    // Output: [[3],[9,20],[15,7]]
  }

  public static void main(String[] args) {
    BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
    TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), null),
        new TreeNode(3, new TreeNode(5), null));
    List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(node);
    for (List<Integer> list : result
    ) {
      System.out.print("[");
      for (Integer val : list) {
        System.out.print(val + ", ");
      }
      System.out.println("]");
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root != null) {
      result.add(List.of(root.val));
      getNode(root, result, 2);
    }
    return result;
  }

  public void getNode(TreeNode node, List<List<Integer>> list, int deep) {
    List<Integer> children = new ArrayList<>();
    if (node == null) {
      return;
    }
    if (node.left != null) {
      children.add(node.left.val);
    }
    if (node.right != null) {
      children.add(node.right.val);
    }
    if (!children.isEmpty()) {
      if (list.size() > deep - 1) {
        list.get(deep - 1).addAll(children);
      } else {
        list.add(children);
      }
    }
    if (node.left != null) {
      getNode(node.left, list, deep + 1);
    }
    if (node.right != null) {
      getNode(node.right, list, deep + 1);
    }
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
