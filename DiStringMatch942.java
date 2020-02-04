
import java.util.*;

public class DiStringMatch942 {

  public static void main(String[] args) {
    int[] res = diStringMatch(args[0]);
    System.out.println(Arrays.toString(res));
  }

  public static int[] diStringMatch(String S) {
    int[] ret = new int[S.length() + 1];
    ret[0] = 0;
    int min = 0;
    int max = 0;
    char[] actions = S.toCharArray();
    for(int a = 0; a < actions.length; a++) {
      if('I' == actions[a]) {
        ret[a+1] = ++max;
      }
      if('D' == actions[a]) {
        ret[a+1] = --min;
      }
    }
    if(min < 0) {
      for(int i = 0; i < ret.length; i++) {
        ret[i] += Math.abs(min);
      }
    }
    return ret;
  }

}


