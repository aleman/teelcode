
public class MergeTrees617 {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(3);
    t1.left.left = new TreeNode(5);
    t1.right = new TreeNode(2);
    System.out.println("t1: " + t1);
    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(1);
    t2.left.right = new TreeNode(4);
    t2.right = new TreeNode(3);
    t2.right.right = new TreeNode(7);
    System.out.println("t1: " + t1);
    System.out.println("t1 merge t2: " + mergeTrees(t1, t2));
  }

  public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if(t1 == null && t2 == null) {
      return null;
    }
    if(t1 == null && t2 != null) {
      return t2;
    }
    if(t1 != null && t2 == null) {
      return t1;
    }
    TreeNode ret = new TreeNode(t1.val + t2.val);
    ret.left = mergeTrees(t1.left, t2.left);
    ret.right = mergeTrees(t1.right, t2.right);
    return ret;
  }
}

