
public class SearchBST700 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    System.out.println("root: " + root);
    System.out.println("search 7: " + searchBST(root, 7));
  }

  public static TreeNode searchBST(TreeNode root, int val) {
    if(null == root) {
      return null;
    }
    if(val == root.val) {
      return root;
    }
    if(val < root.val) {
      return searchBST(root.left, val);
    }
    return searchBST(root.right, val);
  }
}

