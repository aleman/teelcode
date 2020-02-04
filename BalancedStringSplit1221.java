
import java.util.*;

public class BalancedStringSplit1221 {

  public static void main(String[] args) {
    System.out.println(balancedStringSplit("RLLLLRRRLR"));
    //System.out.println(balancedStringSplit("RLRRLLRLRL"));
    //System.out.println(balancedStringSplit("LLLLRRRR"));
  }

  public static int balancedStringSplit(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    int ret = 0;
    for(char c : s.toCharArray()) {
      if(stack.isEmpty()) {
        stack.addFirst(c);
        continue;
      }
      Character tmp = stack.peekFirst();
      if(tmp.equals(c)) {
        System.out.println(stack + " also "  + c);
        stack.addFirst(c);
        continue;
      }
      // stack ins't empty, c is different than stack's top
      System.out.println(stack + " ... ? -> " + c);
      stack.removeFirst();
      if(stack.isEmpty()) {
        ret++;
      }
    }
    System.out.println(stack);
    return ret;
  }

}

