
import java.util.*;

public class DiStringMatch942 {

  public static void main(String[] args) {
    int[] res = diStringMatch(args[0]);
    System.out.println(Arrays.toString(res));
  }

  public static int[] diStringMatch(String S) {
    int[] ret = new int[S.length() + 1];
    char[] letters = S.toCharArray();
    int attempt = 0;
    boolean[] taken = new boolean[ret.length];
    do {
      System.out.println();
      System.out.println("will do attemp with a start value of " + attempt + ", taken: " + taken[attempt]);
      ret[0] = attempt;
      Arrays.fill(taken, false);
      taken[attempt] = true;
      System.out.println("  start attemp with a start value of " + attempt + ", taken: " + taken[attempt]);
      char action = 'x';
      for(int i = 0; i < letters.length; i++) {
        for(int t = 0; t < taken.length; t++) {
          System.out.println(" <taken[" + t + "] " + taken[t] + "> <ret[" + t + "] " + ret[t] + ">");
        }
        action = letters[i];
        if('I' == action) {
          System.out.println("    looking-at " + action + " , prev has value:" + ret[i] + " , need value " + (ret[i] + 1) + " or larger");
          int need = ret[i] + 1;
          if(need == ret.length) {
            action = '!';
            break;
          }
          int index = need;
          do {
            System.out.println("                      need value " + need + ", looking at taken[index]::taken[" + index + "]::" + taken[index]);
            if(false == taken[index]) {
              break;
            }
            index++;
          } while (index < taken.length);
          if(index == taken.length) {
            System.out.println("          did not find it");
            break;
          }
          else {
            taken[index] = true;
            ret[i+1] = index;
            System.out.println("          found it !   ret: " + Arrays.toString(ret));
            action = '!';
            continue;
          }
        }
        if('D' == action) {
          System.out.println("    looking-at " + action + " (i=" + i + ") , prev has value:" + ret[i] + " , need value " + (ret[i] - 1) + " or smaller");
          int need = ret[i] - 1;
          if(-1 == need) {
            break;
          }
          int index = need;
          do {
            System.out.println("                      need value " + need + ", looking at taken[index]::taken[" + index + "]::" + taken[index]);
            if(false == taken[index]) {
              break;
            }
            index--;
          } while (index >= 0);
          if(index == -1) {
            System.out.println("          did-not-find-it");
            break;
          }
          else {
            System.out.println("          found-it-!");
            taken[index] = true;
            ret[i+1] = index;
            action = '!';
            continue;
          }
        }
      }
      if(action == '!') {
        break;
      }
      //
      attempt++;
    } while (attempt < ret.length);
    return ret;
  }

}

