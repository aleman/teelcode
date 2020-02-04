
public class Maximum69Number1323 {

  public static void main(String[] args) {
    System.out.println(maximum69Number(6696));
  }

  public static int maximum69Number (int num) {
    String tmp = "";
    boolean changed = false;
    for(char c : (num + "").toCharArray()) {
      System.out.println("__" + c + "__");
      if('9' == c || changed) {
        tmp += c;
        continue;
      }
      tmp += "9";
      changed = true;
    }
      System.out.println("---->" + tmp + "<----");
    int ret = 0;
    try {
      ret = Integer.parseInt(tmp);
    }
    catch(Exception ignore) {
    }
    return ret;
  }

}


