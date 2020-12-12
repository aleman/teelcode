
import java.util.*;

public class Node {
  public int val;

  public List<Node> children;

  public Node() {}

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }

  public String toString() {
    return toString(0);
  }

  public String toString(int q) {
    String spaces = "";
    for(int i = 0; i < q; i++) {
      spaces += " ";
    }
    String ret = spaces + val + " ... ";
    if(null == children) {
      ret += "x";
    }
    else {
      ret += "[ ";
      for(Node node : children) { 
        ret += node.val + ", ";
      }
      ret += " ]";
      for(Node node : children) { 
        ret += "\n";
        ret += node.toString(q + 2);
      }
    }
    return ret;
  }

  public static void main(String[] args) {
    Node leaf1 = new Node(5, null);
    Node leaf2 = new Node(6, null);
    List<Node> leftNodes = new ArrayList<>();
    leftNodes.add(leaf1);
    leftNodes.add(leaf2);
    Node left = new Node(3, leftNodes);
    List<Node> rootList = new ArrayList<>();
    rootList.add(left);
    rootList.add(new Node(2,null));
    rootList.add(new Node(4,null));
    Node root = new Node(1, rootList);
    System.out.println(root);
  }
}

