package leetcode75.level1.day8;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key. The right
 * subtree of a node contains only nodes with keys greater than the node's key. Both the left and
 * right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {


  public ValidateBinarySearchTree() {
    // Input: root = [2,1,3]
    // Output: true
  }

  public static void main(String[] args) {
    ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
    TreeNode node = new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(2)),
        new TreeNode(5, new TreeNode(4), new TreeNode(6)));
    System.out.println("RESULT: " + validateBinarySearchTree.isValidBST(node));
  }

  public boolean isValid(TreeNode root, Integer low, Integer high) {
    if (root == null) {
      return true;
    }
    // The current node's value must be between low and high.
    if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
      return false;
    }
    return isValid(root.right, root.val, high) && isValid(root.left, low, root.val);
  }

  public boolean isValidBST(TreeNode root) {
    return isValid(root, null, null);
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
