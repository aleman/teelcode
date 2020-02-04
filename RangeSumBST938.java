
public class RangeSumBST938 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(15);
    root.right.right = new TreeNode(18);
    System.out.println("root: " + rangeSumBST(root, 7,15));
  }

  public static int rangeSumBST(TreeNode root, int L, int R) {
    int ret = 0;
    if(root.left != null) {
      ret += rangeSumBST(root.left, L, R);
    }
    if(root.val >= L && root.val <= R) {
      ret += root.val;
    }
    if(root.right != null) {
      ret += rangeSumBST(root.right, L, R);
    }
    return ret;
  }

}

