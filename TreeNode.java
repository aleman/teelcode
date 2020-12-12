public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  public String toString() {
    String ret = "[";
    if(left != null) {
      String leftSide = left.toString();
      ret += leftSide.substring(1, leftSide.length() - 1);
    }
    if(ret.length() > 1) {
      ret += ",";
    }
    ret += val;
    if(right != null) {
      ret += ",";
      String rightSide = right.toString();
      ret += rightSide.substring(1);
    }
    else {
      ret += "]";
    }
    return ret;
  }

  public String toString(int L, int R) {
    String ret = "[";
    if(left != null) {
      String leftSide = left.toString(L, R);
      ret += leftSide.substring(1, leftSide.length() - 1);
    }
    if(ret.length() > 1) {
      ret += ",";
    }
    if(val >= L && val <= R) {
      ret += val;
    }
    if(right != null) {
      ret += ",";
      String rightSide = right.toString(L, R);
      ret += rightSide.substring(1);
    }
    else {
      ret += "]";
    }
    return ret;
  }


}
