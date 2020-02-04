
import java.util.*;

public class Postorder590 {

  public static List<Integer> postorder(Node root) {
    List<Integer> ret = new ArrayList<>();
    if(null == root) {
      return ret;
    }
    Deque<Node> deque = new ArrayDeque<>();
    deque.addFirst(root);

    while(!deque.isEmpty()) {
      Node node = deque.removeFirst();
      if(null == node.children || node.children.isEmpty()) {
        ret.add(node.val);
      }
      else {
        deque.addFirst(new Node(node.val,null));
        for(int i = node.children.size() - 1; i >= 0; i--) {
          deque.addFirst(node.children.get(i));
        }
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
    //Node root = new Node(1, new ArrayList<Node>());

    System.out.println(root);
    System.out.println(postorder(root));
  }
}

