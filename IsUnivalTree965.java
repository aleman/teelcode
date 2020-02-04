
public class IsUnivalTree965 {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(1);
    t1.left.left = new TreeNode(1);
    t1.right = new TreeNode(1);
    System.out.println("t1: " + t1);
    System.out.println("t1: " + isUnivalTree(t1));
  }

  public static boolean isUnivalTree(TreeNode root) {
    if(root == null) return true;
    return isUnivalTree(root, root.val);
  }
  public static boolean isUnivalTree(TreeNode root, int val) {
    if(null == root) return true;
    boolean left = isUnivalTree(root.left, val);
    boolean right = isUnivalTree(root.right, val);
    return root.val == val && left && right;
  }
}

