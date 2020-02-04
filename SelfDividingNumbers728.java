
import java.util.*;

public class SelfDividingNumbers728 {

  public static void main(String[] args) {
    int left = Integer.parseInt(args[0]);
    int right = Integer.parseInt(args[1]);
    List<Integer> res = selfDividingNumbers(left, right);
    System.out.println(res);
  }

  public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> ret = new ArrayList<>();
    Map<Character,Integer> map = null;
    for(int value = left; value <= right; value++) {
      System.out.println("\n\nvalue: " + value);
      if(value < 10) {
        ret.add(value);
        continue;
      }
      int work = value;
      if(("" + work).indexOf("0") >= 0) {
        continue;
      }
      int resid;
      int divi;
      do {
        resid = work % 10;
        divi = work / 10;
        System.out.println("divi: " + divi + " ,       resid: " + resid + "  , value/resid = " + value + "%" + resid + " = " + (value%resid));
        if(value % resid != 0) {
          work = -1;
          break;
        }
        work = divi;
      } while(work >0); 
      if(work >= 0) {
        ret.add(value);
      }
    }

    return ret;
  }
}

