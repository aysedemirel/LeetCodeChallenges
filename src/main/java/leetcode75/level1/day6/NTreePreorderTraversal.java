package leetcode75.level1.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal. Each group of
 * children is separated by the null value (See examples)
 */
public class NTreePreorderTraversal {

  public NTreePreorderTraversal() {
    // Input: root = [1,null,3,2,4,null,5,6]
    // Output: [1,3,5,6,2,4]
  }

  public static void main(String[] args) {
    NTreePreorderTraversal nTreePreorderTraversal = new NTreePreorderTraversal();
    List<Node> childrenRoot = new ArrayList<>();
    List<Node> children = new ArrayList<>();
    children.add(new Node(5));
    children.add(new Node(6));
    childrenRoot.add(new Node(3, children));
    childrenRoot.add(new Node(2));
    childrenRoot.add(new Node(4));
    List<Integer> result = nTreePreorderTraversal.preorder(new Node(1, childrenRoot));
    System.out.println(
        "\nRESULT: " + result.toString());
  }

  public List<Integer> preorder(Node root) {
    List<Integer> result = new ArrayList<>();
    printNode(root);
    getNode(root, result);
    return result;
  }

  public void getNode(Node node, List<Integer> list) {
    if (node != null) {
      list.add(node.val);
      if (node.children != null) {
        for (int i = 0; i < node.children.size(); i++) {
          getNode(node.children.get(i), list);
        }
      }
    }
  }

  public void printNode(Node node) {
    System.out.print(node.val + ", ");
    if (node.children != null) {
      for (int i = 0; i < node.children.size(); i++) {
        printNode(node.children.get(i));
      }
    }
  }

}

//    Node
// val  List<Node>
class Node {

  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }

  // for example
  public Node(int _val, Node _child) {
    val = _val;
    if (children == null) {
      children = new ArrayList<>();
    }
    children.add(_child);
  }

}
